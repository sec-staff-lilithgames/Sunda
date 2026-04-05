package zq;

import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j extends f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f98435e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar) {
        super(0);
        this.f98435e = lVar;
    }

    @Override // kv.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final TextView invoke() {
        return (TextView) this.f98435e.findViewById(R.id.bmPrivacySheetSubtitle);
    }
}
