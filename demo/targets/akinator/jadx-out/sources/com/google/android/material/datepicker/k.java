package com.google.android.material.datepicker;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class k implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f29182a;

    public k(s sVar) {
        this.f29182a = sVar;
    }

    @Override // com.google.android.material.datepicker.r
    public void onDayClick(long j10) {
        s sVar = this.f29182a;
        if (sVar.f29193e.getDateValidator().isValid(j10)) {
            sVar.getClass();
            throw null;
        }
    }
}
