package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.e0;
import tu.g0;
import tu.k0;
import tu.o0;
import tu.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ComposerForUnsignedNumbers extends Composer {
    private final boolean forceQuoting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerForUnsignedNumbers(InternalJsonWriter writer, boolean z10) {
        super(writer);
        e0.checkNotNullParameter(writer, "writer");
        this.forceQuoting = z10;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(int i10) {
        boolean z10 = this.forceQuoting;
        int iM7056constructorimpl = k0.m7056constructorimpl(i10);
        if (z10) {
            printQuoted(Long.toString(iM7056constructorimpl & 4294967295L, 10));
        } else {
            print(Long.toString(iM7056constructorimpl & 4294967295L, 10));
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(long j10) {
        boolean z10 = this.forceQuoting;
        int i10 = 63;
        String str = "0";
        long jM7081constructorimpl = o0.m7081constructorimpl(j10);
        if (z10) {
            if (jM7081constructorimpl != 0) {
                if (jM7081constructorimpl > 0) {
                    str = Long.toString(jM7081constructorimpl, 10);
                } else {
                    char[] cArr = new char[64];
                    long j11 = (jM7081constructorimpl >>> 1) / 5;
                    long j12 = 10;
                    cArr[63] = Character.forDigit((int) (jM7081constructorimpl - (j11 * j12)), 10);
                    while (j11 > 0) {
                        i10--;
                        cArr[i10] = Character.forDigit((int) (j11 % j12), 10);
                        j11 /= j12;
                    }
                    str = new String(cArr, i10, 64 - i10);
                }
            }
            printQuoted(str);
            return;
        }
        if (jM7081constructorimpl != 0) {
            if (jM7081constructorimpl > 0) {
                str = Long.toString(jM7081constructorimpl, 10);
            } else {
                char[] cArr2 = new char[64];
                long j13 = (jM7081constructorimpl >>> 1) / 5;
                long j14 = 10;
                cArr2[63] = Character.forDigit((int) (jM7081constructorimpl - (j13 * j14)), 10);
                while (j13 > 0) {
                    i10--;
                    cArr2[i10] = Character.forDigit((int) (j13 % j14), 10);
                    j13 /= j14;
                }
                str = new String(cArr2, i10, 64 - i10);
            }
        }
        print(str);
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(byte b10) {
        boolean z10 = this.forceQuoting;
        String strM7035toStringimpl = g0.m7035toStringimpl(g0.m7031constructorimpl(b10));
        if (z10) {
            printQuoted(strM7035toStringimpl);
        } else {
            print(strM7035toStringimpl);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(short s10) {
        boolean z10 = this.forceQuoting;
        String strM7110toStringimpl = t0.m7110toStringimpl(t0.m7106constructorimpl(s10));
        if (z10) {
            printQuoted(strM7110toStringimpl);
        } else {
            print(strM7110toStringimpl);
        }
    }
}
