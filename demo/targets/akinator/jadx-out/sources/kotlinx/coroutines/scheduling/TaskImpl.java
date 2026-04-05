package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.DebugStringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class TaskImpl extends Task {
    public final Runnable block;

    public TaskImpl(Runnable runnable, long j10, boolean z10) {
        super(j10, z10);
        this.block = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.block.run();
    }

    public String toString() {
        return "Task[" + DebugStringsKt.getClassSimpleName(this.block) + '@' + DebugStringsKt.getHexAddress(this.block) + ", " + this.submissionTime + ", " + TasksKt.taskContextString(this.taskContext) + AbstractJsonLexerKt.END_LIST;
    }
}
