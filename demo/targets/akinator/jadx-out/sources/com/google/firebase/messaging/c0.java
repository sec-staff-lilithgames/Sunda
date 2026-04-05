package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import com.digidust.elokence.akinator.activities.OneCharacterProposalActivity;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import com.google.android.gms.tasks.OnSuccessListener;
import io.bidmachine.BidMachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class c0 implements OnSuccessListener, rr.b, da.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f29770c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f29771e;

    public /* synthetic */ c0(Context context, int i10, boolean z10) {
        this.f29769b = i10;
        this.f29771e = context;
        this.f29770c = z10;
    }

    @Override // rr.b
    public Object get() {
        return BidMachine.lambda$setConsentConfig$3(this.f29770c, (String) this.f29771e);
    }

    @Override // da.p
    public void onClose() {
        int i10 = this.f29769b;
        boolean z10 = this.f29770c;
        Object obj = this.f29771e;
        switch (i10) {
            case 2:
                int i11 = OneCharacterProposalActivity.S;
                ((OneCharacterProposalActivity) obj).v(z10);
                break;
            default:
                int i12 = QuestionActivity.f21703n0;
                ((QuestionActivity) obj).y(z10);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        SharedPreferences.Editor editorEdit = jh.i.D((Context) this.f29771e).edit();
        editorEdit.putBoolean("proxy_retention", this.f29770c);
        editorEdit.apply();
    }

    public /* synthetic */ c0(boolean z10, String str) {
        this.f29769b = 1;
        this.f29770c = z10;
        this.f29771e = str;
    }
}
