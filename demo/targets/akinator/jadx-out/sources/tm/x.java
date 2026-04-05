package tm;

import android.content.Context;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f87146a;

    /* renamed from: b, reason: collision with root package name */
    public final int f87147b;

    public x(boolean z10, int i10) {
        this.f87146a = z10;
        this.f87147b = i10;
    }

    public static int forceOrientationFromString(String str) {
        int iIndexOf = Arrays.asList("portrait", "landscape", "none").indexOf(str);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        return 2;
    }

    public String forceOrientationString() {
        int i10 = this.f87147b;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "error" : "none" : "landscape" : "portrait";
    }

    public int obtainTargetActivityOrientation(Context context) {
        int i10 = context.getResources().getConfiguration().orientation == 1 ? 1 : 0;
        int i11 = this.f87147b;
        if (i11 == 0) {
            return 1;
        }
        if (i11 == 1) {
            return 0;
        }
        if (this.f87146a) {
            return -1;
        }
        return i10;
    }

    public String toString() {
        return "MRAIDOrientationProperties{allowOrientationChange=" + this.f87146a + ", forceOrientation=" + forceOrientationString() + AbstractJsonLexerKt.END_OBJ;
    }
}
