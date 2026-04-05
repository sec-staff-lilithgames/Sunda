package kotlinx.coroutines.scheduling;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class Task implements Runnable {
    public long submissionTime;
    public boolean taskContext;

    public Task(long j10, boolean z10) {
        this.submissionTime = j10;
        this.taskContext = z10;
    }

    public Task() {
        this(0L, false);
    }
}
