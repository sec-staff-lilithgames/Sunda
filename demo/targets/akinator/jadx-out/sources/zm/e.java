package zm;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import um.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class e extends b {

    /* renamed from: g, reason: collision with root package name */
    public String f98314g;

    public e(Context context) {
        super(context);
        this.f98314g = "%1.0fs";
    }

    @Override // zm.b, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (TextUtils.isEmpty(getText())) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setProgress(int i10, int i11) {
        setProgress(Math.round((i10 / i11) * 100.0f));
    }

    public void setRemaining(int i10) {
        setText(this.f98314g.replace("%1.0f", String.valueOf(i10)));
    }

    @Override // zm.b, um.o
    public void setStyle(p pVar) {
        super.setStyle(pVar);
        String content = pVar.getContent();
        if (content != null) {
            this.f98314g = content;
        }
    }

    public void setProgress(int i10) {
        setText(this.f98314g.replace("%1.0f", String.valueOf(i10)));
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f98314g = "%1.0fs";
    }
}
