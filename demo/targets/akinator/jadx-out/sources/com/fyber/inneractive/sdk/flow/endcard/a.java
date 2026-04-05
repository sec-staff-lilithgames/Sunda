package com.fyber.inneractive.sdk.flow.endcard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public final String f23553a = IAlog.a(this);

    /* renamed from: b, reason: collision with root package name */
    public final b f23554b;

    public a(b bVar) {
        this.f23554b = bVar;
    }

    public static ViewGroup a(View view) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(view.getContext()).inflate(R.layout.ia_endcard_container, (ViewGroup) null);
        viewGroup.addView(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
        return viewGroup;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public void destroy() {
        a();
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public void a() {
        com.fyber.inneractive.sdk.util.v.a(b());
    }

    public void c() {
    }
}
