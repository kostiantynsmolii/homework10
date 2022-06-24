import java.util.stream.Stream;

public class Task4 {
    Long seed;
    Long a;
    int c;
    Long m;

    public Task4(Long seed, Long a, int c, Long m) {
        this.seed = seed;
        this.a = a;
        this.c = c;
        this.m = m;
    }

    public Long generator(Long seed) {
        return (a * seed + c) % m;
    }

    public Stream<Long> randomAlgorithm() {
        return Stream.iterate(seed, i -> i = generator(i));
    }
}
