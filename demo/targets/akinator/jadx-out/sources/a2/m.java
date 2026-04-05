package a2;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m implements d2 {

    /* renamed from: a, reason: collision with root package name */
    public final ClipboardManager f3724a;

    public m(ClipboardManager clipboardManager) {
        kotlin.jvm.internal.e0.checkNotNullParameter(clipboardManager, "clipboardManager");
        this.f3724a = clipboardManager;
    }

    @Override // a2.d2
    public g2.b getText() {
        ClipData primaryClip = this.f3724a.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        return n.convertToAnnotatedString(itemAt != null ? itemAt.getText() : null);
    }

    public final boolean hasText() {
        ClipDescription primaryClipDescription = this.f3724a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/plain");
        }
        return false;
    }

    @Override // a2.d2
    public void setText(g2.b annotatedString) {
        kotlin.jvm.internal.e0.checkNotNullParameter(annotatedString, "annotatedString");
        this.f3724a.setPrimaryClip(ClipData.newPlainText("plain text", n.convertToCharSequence(annotatedString)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("clipboard");
        if (systemService != null) {
            this((ClipboardManager) systemService);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
    }
}
