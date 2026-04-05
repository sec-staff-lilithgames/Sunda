package zq;

import android.view.View;
import com.digidust.elokence.akinator.freemium.R;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i extends f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f98434e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar) {
        super(0);
        this.f98434e = lVar;
    }

    @Override // kv.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final View invoke() {
        return this.f98434e.findViewById(R.id.bmPrivacySheetClose);
    }
}
