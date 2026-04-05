package io.ktor.utils.io.core;

import ao.kwoC.zAQQWzBxnS;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import io.ktor.utils.io.bits.Memory;
import java.io.EOFException;
import kotlin.jvm.internal.e0;
import kv.q;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class BufferKt {
    public static final boolean canRead(Buffer buffer) {
        e0.checkNotNullParameter(buffer, "<this>");
        return buffer.getWritePosition() > buffer.getReadPosition();
    }

    public static final boolean canWrite(Buffer buffer) {
        e0.checkNotNullParameter(buffer, "<this>");
        return buffer.getLimit() > buffer.getWritePosition();
    }

    public static final Void commitWrittenFailed(int i10, int i11) {
        throw new EOFException(o2.i(i10, i11, "Unable to discard ", " bytes: only ", " available for writing"));
    }

    public static final Void discardFailed(int i10, int i11) {
        throw new EOFException(o2.i(i10, i11, "Unable to discard ", " bytes: only ", " available for reading"));
    }

    public static final void endGapReservationFailedDueToCapacity(Buffer buffer, int i10) {
        e0.checkNotNullParameter(buffer, "<this>");
        StringBuilder sbT = o2.t(i10, "End gap ", " is too big: capacity is ");
        sbT.append(buffer.getCapacity());
        throw new IllegalArgumentException(sbT.toString());
    }

    public static final void endGapReservationFailedDueToContent(Buffer buffer, int i10) {
        e0.checkNotNullParameter(buffer, "<this>");
        StringBuilder sbT = o2.t(i10, "Unable to reserve end gap ", ": there are already ");
        sbT.append(buffer.getWritePosition() - buffer.getReadPosition());
        sbT.append(" content bytes at offset ");
        sbT.append(buffer.getReadPosition());
        throw new IllegalArgumentException(sbT.toString());
    }

    public static final void endGapReservationFailedDueToStartGap(Buffer buffer, int i10) {
        e0.checkNotNullParameter(buffer, "<this>");
        StringBuilder sbT = o2.t(i10, "End gap ", " is too big: there are already ");
        sbT.append(buffer.getStartGap());
        sbT.append(" bytes reserved in the beginning");
        throw new IllegalArgumentException(sbT.toString());
    }

    public static final int read(Buffer buffer, q block) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(block, "block");
        int iIntValue = ((Number) block.invoke(Memory.m4313boximpl(buffer.m4458getMemorySK3TCg8()), Integer.valueOf(buffer.getReadPosition()), Integer.valueOf(buffer.getWritePosition()))).intValue();
        buffer.discardExact(iIntValue);
        return iIntValue;
    }

    public static final void restoreStartGap(Buffer buffer, int i10) {
        e0.checkNotNullParameter(buffer, "<this>");
        buffer.releaseStartGap$ktor_io(buffer.getReadPosition() - i10);
    }

    public static final Void rewindFailed(int i10, int i11) {
        throw new IllegalArgumentException(o2.i(i10, i11, "Unable to rewind ", " bytes: only ", " could be rewinded"));
    }

    public static final int write(Buffer buffer, q block) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(block, "block");
        int iIntValue = ((Number) block.invoke(Memory.m4313boximpl(buffer.m4458getMemorySK3TCg8()), Integer.valueOf(buffer.getWritePosition()), Integer.valueOf(buffer.getLimit()))).intValue();
        buffer.commitWritten(iIntValue);
        return iIntValue;
    }

    public static final Void startGapReservationFailed(Buffer buffer, int i10) {
        e0.checkNotNullParameter(buffer, TJzY.EzmQJn);
        StringBuilder sbT = o2.t(i10, "Unable to reserve ", " start gap: there are already ");
        sbT.append(buffer.getWritePosition() - buffer.getReadPosition());
        sbT.append(" content bytes starting at offset ");
        sbT.append(buffer.getReadPosition());
        throw new IllegalStateException(sbT.toString());
    }

    public static final Void startGapReservationFailedDueToLimit(Buffer buffer, int i10) {
        e0.checkNotNullParameter(buffer, "<this>");
        if (i10 > buffer.getCapacity()) {
            StringBuilder sbT = o2.t(i10, zAQQWzBxnS.PaVPDmUgNe, " is bigger than the capacity ");
            sbT.append(buffer.getCapacity());
            throw new IllegalArgumentException(sbT.toString());
        }
        StringBuilder sbT2 = o2.t(i10, "Unable to reserve ", " start gap: there are already ");
        sbT2.append(buffer.getCapacity() - buffer.getLimit());
        sbT2.append(" bytes reserved in the end");
        throw new IllegalStateException(sbT2.toString());
    }
}
