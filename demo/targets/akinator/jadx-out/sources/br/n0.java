package br;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum n0 implements ir.i {
    OnImpression("on_impression"),
    OnClick("on_click"),
    OnMute("on_mute"),
    OnUnMute("on_unmute"),
    OnPause("on_pause"),
    OnResume("on_resume"),
    OnSkip("on_skip"),
    OnClose("on_close"),
    OnStart("on_start"),
    OnFirstQuartile("on_first_quartile"),
    OnMidpoint("on_midpoint"),
    OnThirdQuartile("on_third_quartile"),
    OnComplete("on_complete"),
    OnProgress("on_progress"),
    OnUseCustomClose("on_use_custom_close"),
    OnScheduled("on_scheduled"),
    OnNavigate("on_navigate");


    /* renamed from: c, reason: collision with root package name */
    public static final m0 f9928c = new m0(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f9947b;

    n0(String str) {
        this.f9947b = str;
    }

    public static final n0 get(String str) {
        return f9928c.get(str);
    }

    @Override // ir.i
    public String getKey() {
        return this.f9947b;
    }
}
