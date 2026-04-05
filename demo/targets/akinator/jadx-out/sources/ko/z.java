package ko;

import java.io.IOException;
import java.util.List;
import nh.b5;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface z {
    default List<c1> getSniffFailureDetails() {
        return b5.of();
    }

    void init(c0 c0Var);

    int read(a0 a0Var, v0 v0Var) throws IOException;

    void release();

    void seek(long j10, long j11);

    boolean sniff(a0 a0Var) throws IOException;

    @SideEffectFree
    default z getUnderlyingImplementation() {
        return this;
    }
}
