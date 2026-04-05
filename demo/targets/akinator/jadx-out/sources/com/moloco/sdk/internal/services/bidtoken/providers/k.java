package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.core.app.NotificationCompat;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f46893a;

    /* renamed from: b, reason: collision with root package name */
    public final MolocoPrivacy.PrivacySettings f46894b;

    /* renamed from: c, reason: collision with root package name */
    public final s f46895c;

    /* renamed from: d, reason: collision with root package name */
    public final d f46896d;

    /* renamed from: e, reason: collision with root package name */
    public final u f46897e;

    /* renamed from: f, reason: collision with root package name */
    public final h f46898f;

    /* renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.o f46899g;

    /* renamed from: h, reason: collision with root package name */
    public final o f46900h;

    /* renamed from: i, reason: collision with root package name */
    public final f f46901i;

    /* renamed from: j, reason: collision with root package name */
    public final a f46902j;

    /* renamed from: k, reason: collision with root package name */
    public final q f46903k;

    public k(boolean z10, MolocoPrivacy.PrivacySettings privacySettings, s memoryInfo, d appDirInfo, u networkInfoSignal, h batteryInfoSignal, com.moloco.sdk.internal.services.o adDataSignal, o deviceSignal, f audioSignal, a accessibilitySignal, q ilrdSignal) {
        e0.checkNotNullParameter(privacySettings, "privacySettings");
        e0.checkNotNullParameter(memoryInfo, "memoryInfo");
        e0.checkNotNullParameter(appDirInfo, "appDirInfo");
        e0.checkNotNullParameter(networkInfoSignal, "networkInfoSignal");
        e0.checkNotNullParameter(batteryInfoSignal, "batteryInfoSignal");
        e0.checkNotNullParameter(adDataSignal, "adDataSignal");
        e0.checkNotNullParameter(deviceSignal, "deviceSignal");
        e0.checkNotNullParameter(audioSignal, "audioSignal");
        e0.checkNotNullParameter(accessibilitySignal, "accessibilitySignal");
        e0.checkNotNullParameter(ilrdSignal, "ilrdSignal");
        this.f46893a = z10;
        this.f46894b = privacySettings;
        this.f46895c = memoryInfo;
        this.f46896d = appDirInfo;
        this.f46897e = networkInfoSignal;
        this.f46898f = batteryInfoSignal;
        this.f46899g = adDataSignal;
        this.f46900h = deviceSignal;
        this.f46901i = audioSignal;
        this.f46902j = accessibilitySignal;
        this.f46903k = ilrdSignal;
    }

    public final boolean a() {
        return this.f46893a;
    }

    public final a b() {
        return this.f46902j;
    }

    public final q c() {
        return this.f46903k;
    }

    public final MolocoPrivacy.PrivacySettings d() {
        return this.f46894b;
    }

    public final s e() {
        return this.f46895c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f46893a == kVar.f46893a && e0.areEqual(this.f46894b, kVar.f46894b) && e0.areEqual(this.f46895c, kVar.f46895c) && e0.areEqual(this.f46896d, kVar.f46896d) && e0.areEqual(this.f46897e, kVar.f46897e) && e0.areEqual(this.f46898f, kVar.f46898f) && e0.areEqual(this.f46899g, kVar.f46899g) && e0.areEqual(this.f46900h, kVar.f46900h) && e0.areEqual(this.f46901i, kVar.f46901i) && e0.areEqual(this.f46902j, kVar.f46902j) && e0.areEqual(this.f46903k, kVar.f46903k);
    }

    public final d f() {
        return this.f46896d;
    }

    public final u g() {
        return this.f46897e;
    }

    public final h h() {
        return this.f46898f;
    }

    public int hashCode() {
        return this.f46903k.hashCode() + ((this.f46902j.hashCode() + ((this.f46901i.hashCode() + ((this.f46900h.hashCode() + ((this.f46899g.hashCode() + ((this.f46898f.hashCode() + ((this.f46897e.hashCode() + ((this.f46896d.hashCode() + ((this.f46895c.hashCode() + ((this.f46894b.hashCode() + (Boolean.hashCode(this.f46893a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final com.moloco.sdk.internal.services.o i() {
        return this.f46899g;
    }

    public final o j() {
        return this.f46900h;
    }

    public final f k() {
        return this.f46901i;
    }

    public final a l() {
        return this.f46902j;
    }

    public final com.moloco.sdk.internal.services.o m() {
        return this.f46899g;
    }

    public final d n() {
        return this.f46896d;
    }

    public final f o() {
        return this.f46901i;
    }

    public final h p() {
        return this.f46898f;
    }

    public final o q() {
        return this.f46900h;
    }

    public final q r() {
        return this.f46903k;
    }

    public final s s() {
        return this.f46895c;
    }

    public final u t() {
        return this.f46897e;
    }

    public String toString() {
        return "ClientSignals(sdkInitialized=" + this.f46893a + ", privacySettings=" + this.f46894b + ", memoryInfo=" + this.f46895c + ", appDirInfo=" + this.f46896d + ", networkInfoSignal=" + this.f46897e + ", batteryInfoSignal=" + this.f46898f + ", adDataSignal=" + this.f46899g + ", deviceSignal=" + this.f46900h + ", audioSignal=" + this.f46901i + ", accessibilitySignal=" + this.f46902j + ", ilrdSignal=" + this.f46903k + ')';
    }

    public final MolocoPrivacy.PrivacySettings u() {
        return this.f46894b;
    }

    public final boolean v() {
        return this.f46893a;
    }

    public final k a(boolean z10, MolocoPrivacy.PrivacySettings privacySettings, s memoryInfo, d appDirInfo, u networkInfoSignal, h batteryInfoSignal, com.moloco.sdk.internal.services.o adDataSignal, o deviceSignal, f audioSignal, a accessibilitySignal, q ilrdSignal) {
        e0.checkNotNullParameter(privacySettings, "privacySettings");
        e0.checkNotNullParameter(memoryInfo, "memoryInfo");
        e0.checkNotNullParameter(appDirInfo, "appDirInfo");
        e0.checkNotNullParameter(networkInfoSignal, "networkInfoSignal");
        e0.checkNotNullParameter(batteryInfoSignal, "batteryInfoSignal");
        e0.checkNotNullParameter(adDataSignal, "adDataSignal");
        e0.checkNotNullParameter(deviceSignal, "deviceSignal");
        e0.checkNotNullParameter(audioSignal, "audioSignal");
        e0.checkNotNullParameter(accessibilitySignal, "accessibilitySignal");
        e0.checkNotNullParameter(ilrdSignal, "ilrdSignal");
        return new k(z10, privacySettings, memoryInfo, appDirInfo, networkInfoSignal, batteryInfoSignal, adDataSignal, deviceSignal, audioSignal, accessibilitySignal, ilrdSignal);
    }

    public static /* synthetic */ k a(k kVar, boolean z10, MolocoPrivacy.PrivacySettings privacySettings, s sVar, d dVar, u uVar, h hVar, com.moloco.sdk.internal.services.o oVar, o oVar2, f fVar, a aVar, q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = kVar.f46893a;
        }
        if ((i10 & 2) != 0) {
            privacySettings = kVar.f46894b;
        }
        if ((i10 & 4) != 0) {
            sVar = kVar.f46895c;
        }
        if ((i10 & 8) != 0) {
            dVar = kVar.f46896d;
        }
        if ((i10 & 16) != 0) {
            uVar = kVar.f46897e;
        }
        if ((i10 & 32) != 0) {
            hVar = kVar.f46898f;
        }
        if ((i10 & 64) != 0) {
            oVar = kVar.f46899g;
        }
        if ((i10 & 128) != 0) {
            oVar2 = kVar.f46900h;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            fVar = kVar.f46901i;
        }
        if ((i10 & 512) != 0) {
            aVar = kVar.f46902j;
        }
        if ((i10 & 1024) != 0) {
            qVar = kVar.f46903k;
        }
        a aVar2 = aVar;
        q qVar2 = qVar;
        o oVar3 = oVar2;
        f fVar2 = fVar;
        h hVar2 = hVar;
        com.moloco.sdk.internal.services.o oVar4 = oVar;
        u uVar2 = uVar;
        s sVar2 = sVar;
        return kVar.a(z10, privacySettings, sVar2, dVar, uVar2, hVar2, oVar4, oVar3, fVar2, aVar2, qVar2);
    }
}
