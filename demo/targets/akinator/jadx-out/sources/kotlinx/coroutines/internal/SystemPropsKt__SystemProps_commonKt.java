package kotlinx.coroutines.internal;

import b0.e2;
import sv.j0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class SystemPropsKt__SystemProps_commonKt {
    public static final boolean systemProp(String str, boolean z10) {
        String strSystemProp = SystemPropsKt.systemProp(str);
        return strSystemProp != null ? Boolean.parseBoolean(strSystemProp) : z10;
    }

    public static /* synthetic */ int systemProp$default(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return SystemPropsKt.systemProp(str, i10, i11, i12);
    }

    public static final int systemProp(String str, int i10, int i11, int i12) {
        return (int) SystemPropsKt.systemProp(str, i10, i11, i12);
    }

    public static /* synthetic */ long systemProp$default(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return SystemPropsKt.systemProp(str, j10, j13, j12);
    }

    public static final long systemProp(String str, long j10, long j11, long j12) {
        String strSystemProp = SystemPropsKt.systemProp(str);
        if (strSystemProp == null) {
            return j10;
        }
        Long longOrNull = j0.toLongOrNull(strSystemProp);
        if (longOrNull == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strSystemProp + '\'').toString());
        }
        long jLongValue = longOrNull.longValue();
        if (j11 <= jLongValue && jLongValue <= j12) {
            return jLongValue;
        }
        StringBuilder sb2 = new StringBuilder("System property '");
        sb2.append(str);
        sb2.append("' should be in range ");
        sb2.append(j11);
        e2.A(sb2, "..", j12, ", but is '");
        sb2.append(jLongValue);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final String systemProp(String str, String str2) {
        String strSystemProp = SystemPropsKt.systemProp(str);
        return strSystemProp == null ? str2 : strSystemProp;
    }
}
