package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.ironsource.InterfaceC3445sa;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ha, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3251ha extends WebView implements InterfaceC3462ta {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC3445sa f36873a;

    /* renamed from: b, reason: collision with root package name */
    private Sc f36874b;

    public /* synthetic */ C3251ha(Context context, InterfaceC3445sa interfaceC3445sa, int i10, kotlin.jvm.internal.u uVar) {
        this(context, (i10 & 2) != 0 ? new InterfaceC3445sa.a(0, 1, null) : interfaceC3445sa);
    }

    @Override // com.ironsource.InterfaceC3462ta
    public void a(String script) {
        kotlin.jvm.internal.e0.checkNotNullParameter(script, "script");
        InterfaceC3445sa interfaceC3445sa = this.f36873a;
        InterfaceC3445sa interfaceC3445sa2 = null;
        if (interfaceC3445sa == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("javascriptEngine");
            interfaceC3445sa = null;
        }
        if (!interfaceC3445sa.a()) {
            InterfaceC3445sa interfaceC3445sa3 = this.f36873a;
            if (interfaceC3445sa3 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("javascriptEngine");
                interfaceC3445sa3 = null;
            }
            interfaceC3445sa3.a(this);
        }
        InterfaceC3445sa interfaceC3445sa4 = this.f36873a;
        if (interfaceC3445sa4 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("javascriptEngine");
        } else {
            interfaceC3445sa2 = interfaceC3445sa4;
        }
        interfaceC3445sa2.a(script);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent event) {
        Sc sc2;
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        if (i10 == 4 && (sc2 = this.f36874b) != null && sc2.onBackButtonPressed()) {
            return true;
        }
        return super.onKeyDown(i10, event);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3251ha(Context context, InterfaceC3445sa javascriptEngine) {
        this(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        this.f36873a = javascriptEngine;
    }

    public final void a(Sc sc2) {
        this.f36874b = sc2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3251ha(Context context) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
    }

    public final void a() {
        this.f36874b = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3251ha(Context context, AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3251ha(Context context, AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(attrs, "attrs");
    }
}
