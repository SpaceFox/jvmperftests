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
public class InheritanceObjectCreationBench {

    @Benchmark
    public Mamma newMamma() {
        return new Mamma();
    }

    @Benchmark
    public Mamma newChild1() {
        return new Child1();
    }

    @Benchmark
    public Mamma newChild2() {
        return new Child2();
    }

    @Benchmark
    public Mamma newChild4() {
        return new Child4();
    }

    @Benchmark
    public Mamma newChild8() {
        return new Child8();
    }

    @Benchmark
    public Mamma newChild16() {
        return new Child16();
    }

    @Benchmark
    public Mamma newChild32() {
        return new Child32();
    }

    @Benchmark
    public Mamma newChild64() {
        return new Child64();
    }

    @Benchmark
    public Mamma newChild128() {
        return new Child128();
    }

    @Benchmark
    public Mamma newChild256() {
        return new Child256();
    }

    @Benchmark
    public Mamma newChild512() {
        return new Child512();
    }
}
