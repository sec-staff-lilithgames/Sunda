package y3;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    public final int f94029b;

    /* renamed from: c, reason: collision with root package name */
    public final c f94030c;

    /* renamed from: e, reason: collision with root package name */
    public final int f94031e;

    public a(int i10, c cVar, int i11) {
        this.f94029b = i10;
        this.f94030c = cVar;
        this.f94031e = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f94029b);
        this.f94030c.performAction(this.f94031e, bundle);
    }
}
