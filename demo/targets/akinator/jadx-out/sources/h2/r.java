package h2;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f58658a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final o f58659b = new o();

    public static /* synthetic */ StaticLayout create$default(r rVar, CharSequence charSequence, int i10, int i11, TextPaint textPaint, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int[] iArr, int[] iArr2, int i18, Object obj) {
        int[] iArr3;
        r rVar2;
        CharSequence charSequence2;
        TextPaint textPaint2;
        int i19;
        int i20 = (i18 & 2) != 0 ? 0 : i10;
        int length = (i18 & 4) != 0 ? charSequence.length() : i11;
        TextDirectionHeuristic dEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release = (i18 & 32) != 0 ? d.f58633a.getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release() : textDirectionHeuristic;
        Layout.Alignment dEFAULT_LAYOUT_ALIGNMENT$ui_text_release = (i18 & 64) != 0 ? d.f58633a.getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release() : alignment;
        int i21 = (i18 & 128) != 0 ? Integer.MAX_VALUE : i13;
        TextUtils.TruncateAt truncateAt2 = (i18 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : truncateAt;
        int i22 = (i18 & 512) != 0 ? i12 : i14;
        float f12 = (i18 & 1024) != 0 ? 1.0f : f10;
        float f13 = (i18 & 2048) != 0 ? 0.0f : f11;
        int i23 = (i18 & 4096) != 0 ? 0 : i15;
        boolean z12 = (i18 & Segment.SIZE) != 0 ? false : z10;
        boolean z13 = (i18 & 16384) != 0 ? true : z11;
        int i24 = (32768 & i18) != 0 ? 0 : i16;
        int i25 = (65536 & i18) != 0 ? 0 : i17;
        int[] iArr4 = (131072 & i18) != 0 ? null : iArr;
        if ((i18 & 262144) != 0) {
            iArr3 = null;
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            i19 = i12;
            rVar2 = rVar;
        } else {
            iArr3 = iArr2;
            rVar2 = rVar;
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            i19 = i12;
        }
        return rVar2.create(charSequence2, i20, length, textPaint2, i19, dEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release, dEFAULT_LAYOUT_ALIGNMENT$ui_text_release, i21, truncateAt2, i22, f12, f13, i23, z12, z13, i24, i25, iArr4, iArr3);
    }

    public final StaticLayout create(CharSequence text, int i10, int i11, TextPaint paint, int i12, TextDirectionHeuristic textDir, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int[] iArr, int[] iArr2) {
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(paint, "paint");
        e0.checkNotNullParameter(textDir, "textDir");
        e0.checkNotNullParameter(alignment, "alignment");
        return f58659b.create(new t(text, i10, i11, paint, i12, textDir, alignment, i13, truncateAt, i14, f10, f11, i15, z10, z11, i16, i17, iArr, iArr2));
    }
}
