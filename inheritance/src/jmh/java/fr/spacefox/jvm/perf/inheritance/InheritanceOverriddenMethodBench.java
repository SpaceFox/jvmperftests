package fr.spacefox.jvm.perf.inheritance;

import fr.spacefox.jvm.perf.inheritance.testclasses.*;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@Fork(value = 1)
@Threads(1)
@Warmup(iterations = 1)
@Measurement(iterations = 3)
@BenchmarkMode(Mode.AverageTime)
@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class InheritanceOverriddenMethodBench {

    private final Mamma mamma = new Mamma();
    private final Mamma child1 = new Child1();
    private final Mamma child2 = new Child2();
    private final Mamma child4 = new Child4();
    private final Mamma child8 = new Child8();
    private final Mamma child16 = new Child16();
    private final Mamma child32 = new Child32();
    private final Mamma child64 = new Child64();
    private final Mamma child128 = new Child128();
    private final Mamma child256 = new Child256();
    private final Mamma child512 = new Child512();

    @Benchmark
    public int depthMamma() {
        return mamma.depth();
    }

    @Benchmark
    public int depthChild1() {
        return child1.depth();
    }

    @Benchmark
    public int depthChild2() {
        return child2.depth();
    }

    @Benchmark
    public int depthChild4() {
        return child4.depth();
    }

    @Benchmark
    public int depthChild8() {
        return child8.depth();
    }

    @Benchmark
    public int depthChild16() {
        return child16.depth();
    }

    @Benchmark
    public int depthChild32() {
        return child32.depth();
    }

    @Benchmark
    public int depthChild64() {
        return child64.depth();
    }

    @Benchmark
    public int depthChild128() {
        return child128.depth();
    }

    @Benchmark
    public int depthChild256() {
        return child256.depth();
    }

    @Benchmark
    public int depthChild512() {
        return child512.depth();
    }
}
