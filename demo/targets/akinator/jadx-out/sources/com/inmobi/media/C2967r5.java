package com.inmobi.media;

import android.view.OrientationEventListener;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.util.HashSet;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.r5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2967r5 extends OrientationEventListener {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f33302d = {com.google.android.gms.internal.play_billing.a.n(C2967r5.class, "currentOrientation", "getCurrentOrientation()Lcom/inmobi/ads/rendering/orientation/Orientation;", 0)};

    /* renamed from: a, reason: collision with root package name */
    public final InMobiAdActivity f33303a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f33304b;

    /* renamed from: c, reason: collision with root package name */
    public final C2951q5 f33305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2967r5(InMobiAdActivity activity) {
        super(activity);
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        this.f33303a = activity;
        this.f33304b = new HashSet();
        this.f33305c = new C2951q5(Aa.a(AbstractC2679a4.g()), this);
    }

    public final void a(Ba orientationProperties) {
        kotlin.jvm.internal.e0.checkNotNullParameter(orientationProperties, "orientationProperties");
        try {
            if (orientationProperties.f31672a) {
                this.f33303a.setRequestedOrientation(13);
                return;
            }
            String str = orientationProperties.f31673b;
            if (kotlin.jvm.internal.e0.areEqual(str, "landscape")) {
                this.f33303a.setRequestedOrientation(6);
            } else if (kotlin.jvm.internal.e0.areEqual(str, "portrait")) {
                this.f33303a.setRequestedOrientation(7);
            } else {
                this.f33303a.setRequestedOrientation(13);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final void b() {
        int i10 = this.f33303a.getResources().getConfiguration().orientation;
        byte bG = AbstractC2679a4.g();
        int i11 = 1;
        if (bG != 1 && bG != 2 && (bG == 3 || bG == 4)) {
            i11 = 2;
        }
        if (i10 == i11) {
            this.f33305c.setValue(this, f33302d[0], Aa.a(AbstractC2679a4.g()));
        }
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        b();
    }

    public final void a() {
        if (this.f33304b.isEmpty()) {
            disable();
        } else {
            enable();
        }
    }
}
