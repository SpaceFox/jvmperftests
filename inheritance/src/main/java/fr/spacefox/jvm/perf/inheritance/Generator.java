package fr.spacefox.jvm.perf.inheritance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Generator {

    public static void main(String[] args) throws IOException {
        final String template =
                """
                package fr.spacefox.jvm.perf.inheritance.testclasses;

                public class %1$s extends %2$s {
                    @Override
                    public int depth() {
                        return %3$d;
                    }
                }
                """;

        for (int i = 0; i < 512; i++) {
            final String parentName = (i == 0 ? "Mamma" : ("Child" + i));
            final int depth = i + 1;
            final String className = "Child" + depth;
            Files.writeString(
                    Path.of(
                            "inheritance/src/main/java/fr/spacefox/jvm/perf/inheritance/testclasses",
                            className + ".java"),
                    template.formatted(className, parentName, depth));
        }
    }
}
