package com.moloco.sdk.internal.services.bidtoken;

import com.amazon.device.ads.DtbConstants;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.moloco.sdk.BidToken$ClientBidToken;
import com.moloco.sdk.BidToken$ClientBidTokenComponents;
import com.moloco.sdk.b7;
import com.moloco.sdk.d6;
import com.moloco.sdk.d7;
import com.moloco.sdk.e6;
import com.moloco.sdk.g6;
import com.moloco.sdk.h6;
import com.moloco.sdk.internal.services.a;
import com.moloco.sdk.internal.services.h0;
import com.moloco.sdk.internal.services.i0;
import com.moloco.sdk.internal.services.j0;
import com.moloco.sdk.internal.services.o;
import com.moloco.sdk.k6;
import com.moloco.sdk.m6;
import com.moloco.sdk.o6;
import com.moloco.sdk.q6;
import com.moloco.sdk.r5;
import com.moloco.sdk.r6;
import com.moloco.sdk.s5;
import com.moloco.sdk.u5;
import com.moloco.sdk.u6;
import com.moloco.sdk.w5;
import com.moloco.sdk.w6;
import com.moloco.sdk.z5;
import com.moloco.sdk.z6;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class s implements q {

    /* renamed from: b, reason: collision with root package name */
    public final i0 f46940b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.f f46941c;

    public s(i0 deviceInfoService, com.moloco.sdk.internal.services.f screenInfoService) {
        kotlin.jvm.internal.e0.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        kotlin.jvm.internal.e0.checkNotNullParameter(screenInfoService, "screenInfoService");
        this.f46940b = deviceInfoService;
        this.f46941c = screenInfoService;
    }

    public final long a(long j10) {
        return j10 * 1000000;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.q
    public BidToken$ClientBidTokenComponents b(byte[] payload) throws InvalidProtocolBufferException {
        kotlin.jvm.internal.e0.checkNotNullParameter(payload, "payload");
        BidToken$ClientBidTokenComponents from = BidToken$ClientBidTokenComponents.parseFrom(payload);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(from, "parseFrom(...)");
        return from;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.q
    public byte[] a(byte[] bidTokenComponents, byte[] secret) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bidTokenComponents, "bidTokenComponents");
        kotlin.jvm.internal.e0.checkNotNullParameter(secret, "secret");
        r5 r5VarNewBuilder = BidToken$ClientBidToken.newBuilder();
        r5VarNewBuilder.setEs(ByteString.copyFrom(secret));
        r5VarNewBuilder.setPayload(ByteString.copyFrom(bidTokenComponents));
        byte[] byteArray = ((BidToken$ClientBidToken) r5VarNewBuilder.build()).toByteArray();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.q
    public BidToken$ClientBidTokenComponents a(com.moloco.sdk.internal.services.bidtoken.providers.k clientSignals, g bidTokenConfig) {
        d6 d6Var;
        z6 z6Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(clientSignals, "clientSignals");
        kotlin.jvm.internal.e0.checkNotNullParameter(bidTokenConfig, "bidTokenConfig");
        i0 i0Var = this.f46940b;
        h0 h0VarB = i0Var.b();
        com.moloco.sdk.internal.services.e eVarA = this.f46941c.a();
        g6 g6VarNewBuilder = BidToken$ClientBidTokenComponents.newBuilder();
        d7 d7VarNewBuilder = BidToken$ClientBidTokenComponents.SdkInfo.newBuilder();
        d7VarNewBuilder.setInitialized(clientSignals.v());
        g6VarNewBuilder.setInfo((BidToken$ClientBidTokenComponents.SdkInfo) d7VarNewBuilder.build());
        u6 u6VarNewBuilder = BidToken$ClientBidTokenComponents.MemoryInfo.newBuilder();
        Boolean boolD = clientSignals.s().d();
        if (boolD != null) {
            u6VarNewBuilder.setLowMem(boolD.booleanValue());
        }
        Long lE = clientSignals.s().e();
        if (lE != null) {
            u6VarNewBuilder.setLowMemThresholdBytes(lE.longValue());
        }
        Long lF = clientSignals.s().f();
        if (lF != null) {
            u6VarNewBuilder.setTotalMemBytes(lF.longValue());
        }
        g6VarNewBuilder.setMemoryInfo((BidToken$ClientBidTokenComponents.MemoryInfo) u6VarNewBuilder.build());
        m6 m6VarNewBuilder = BidToken$ClientBidTokenComponents.DirInfo.newBuilder();
        Long lB = clientSignals.n().b();
        if (lB != null) {
            m6VarNewBuilder.setDsizeBytes(lB.longValue());
        }
        g6VarNewBuilder.setDirInfo((BidToken$ClientBidTokenComponents.DirInfo) m6VarNewBuilder.build());
        w6 w6VarNewBuilder = BidToken$ClientBidTokenComponents.NetworkInfo.newBuilder();
        if (clientSignals.t().e() != null) {
            w6VarNewBuilder.setMcc(clientSignals.t().e().intValue());
        }
        Integer numF = clientSignals.t().f();
        if (numF != null) {
            w6VarNewBuilder.setMnc(numF.intValue());
        }
        Boolean boolG = clientSignals.t().g();
        if (boolG != null) {
            w6VarNewBuilder.setRestricted(boolG.booleanValue());
        }
        com.moloco.sdk.internal.services.a aVarH = clientSignals.t().h();
        if (aVarH != null) {
            if (aVarH instanceof a.C0386a) {
                z6Var = z6.CELLULAR;
            } else if (kotlin.jvm.internal.e0.areEqual(aVarH, a.b.f46754a)) {
                z6Var = z6.NO_NETWORK;
            } else {
                if (!kotlin.jvm.internal.e0.areEqual(aVarH, a.c.f46755a)) {
                    throw new tu.t();
                }
                z6Var = z6.WIFI;
            }
            w6VarNewBuilder.setType(z6Var);
        }
        g6VarNewBuilder.setNetworkInfo((BidToken$ClientBidTokenComponents.NetworkInfo) w6VarNewBuilder.build());
        e6 e6VarNewBuilder = BidToken$ClientBidTokenComponents.BatteryInfo.newBuilder();
        Integer numE = clientSignals.p().e();
        if (numE != null) {
            e6VarNewBuilder.setMaxBatteryLevel(numE.intValue());
        }
        Integer numD = clientSignals.p().d();
        if (numD != null) {
            int iIntValue = numD.intValue();
            if (iIntValue == 2) {
                d6Var = d6.CHARGING;
            } else if (iIntValue == 3) {
                d6Var = d6.DISCHARGING;
            } else if (iIntValue == 4) {
                d6Var = d6.NOT_CHARGING;
            } else if (iIntValue != 5) {
                d6Var = d6.UNKNOWN;
            } else {
                d6Var = d6.FULL;
            }
            e6VarNewBuilder.setBatteryStatus(d6Var);
        }
        Boolean boolF = clientSignals.p().f();
        if (boolF != null) {
            e6VarNewBuilder.setLowPowMode(boolF.booleanValue());
        }
        g6VarNewBuilder.setBatteryInfo((BidToken$ClientBidTokenComponents.BatteryInfo) e6VarNewBuilder.build());
        u5 u5VarNewBuilder = BidToken$ClientBidTokenComponents.AdvertisingInfo.newBuilder();
        com.moloco.sdk.internal.services.o oVarM = clientSignals.m();
        if (oVarM instanceof o.a) {
            u5VarNewBuilder.setDnt(false);
            u5VarNewBuilder.setId(((o.a) oVarM).b());
        } else if (kotlin.jvm.internal.e0.areEqual(oVarM, o.b.f47164a)) {
            u5VarNewBuilder.setDnt(true);
        } else {
            throw new tu.t();
        }
        g6VarNewBuilder.setAdInfo((BidToken$ClientBidTokenComponents.AdvertisingInfo) u5VarNewBuilder.build());
        b7 b7VarNewBuilder = BidToken$ClientBidTokenComponents.Privacy.newBuilder();
        Boolean boolIsAgeRestrictedUser = clientSignals.u().isAgeRestrictedUser();
        if (boolIsAgeRestrictedUser != null) {
            b7VarNewBuilder.setCoppa(boolIsAgeRestrictedUser.booleanValue());
        }
        Boolean boolIsUserConsent = clientSignals.u().isUserConsent();
        if (boolIsUserConsent != null) {
            b7VarNewBuilder.setGdpr(boolIsUserConsent.booleanValue());
        }
        Boolean boolIsDoNotSell = clientSignals.u().isDoNotSell();
        if (boolIsDoNotSell != null) {
            b7VarNewBuilder.setCcpa(boolIsDoNotSell.booleanValue());
        }
        String tCFConsent = clientSignals.u().getTCFConsent();
        if (tCFConsent != null) {
            b7VarNewBuilder.setTcfConsentString(tCFConsent);
        }
        b7VarNewBuilder.setUsPrivacy(clientSignals.u().getUsPrivacy());
        g6VarNewBuilder.setPrivacy((BidToken$ClientBidTokenComponents.Privacy) b7VarNewBuilder.build());
        h6 h6VarNewBuilder = BidToken$ClientBidTokenComponents.Device.newBuilder();
        h6VarNewBuilder.setLanguage(h0VarB.s());
        h6VarNewBuilder.setOsv(h0VarB.x());
        h6VarNewBuilder.setMake(h0VarB.t());
        h6VarNewBuilder.setModel(h0VarB.v());
        h6VarNewBuilder.setHwv(h0VarB.r());
        h6VarNewBuilder.setCarrier(h0VarB.u());
        h6VarNewBuilder.setDevicetype(h0VarB.z() ? 5 : 1);
        h6VarNewBuilder.setJs(1);
        o6 o6VarNewBuilder = BidToken$ClientBidTokenComponents.Geo.newBuilder();
        o6VarNewBuilder.setUtcoffset(TimeZone.getDefault().getOffset(new Date().getTime()) / DtbConstants.NETWORK_READ_TIMEOUT);
        h6VarNewBuilder.setGeo((BidToken$ClientBidTokenComponents.Geo) o6VarNewBuilder.build());
        h6VarNewBuilder.setW(eVarA.n());
        h6VarNewBuilder.setH(eVarA.l());
        h6VarNewBuilder.setPxratio(eVarA.i());
        h6VarNewBuilder.setPpi(eVarA.j());
        h6VarNewBuilder.setOs(h0VarB.w());
        if (bidTokenConfig.b()) {
            h6VarNewBuilder.setDbt(a(h0VarB.p()));
        }
        com.moloco.sdk.internal.services.h hVarF = clientSignals.q().f();
        if (hVarF != null) {
            h6VarNewBuilder.setOrtn(a(hVarF));
        }
        Boolean boolA = i0Var.a();
        if (boolA != null) {
            h6VarNewBuilder.setHasGy(boolA.booleanValue());
        }
        String strD = clientSignals.q().d();
        if (strD != null) {
            h6VarNewBuilder.setKbLoc(strD);
        }
        String strE = clientSignals.q().e();
        if (strE != null) {
            h6VarNewBuilder.setLocale(strE);
        }
        h6VarNewBuilder.setXdpi(eVarA.o());
        h6VarNewBuilder.setYdpi(eVarA.p());
        h6VarNewBuilder.setHardware(h0VarB.q());
        h6VarNewBuilder.setBrand(h0VarB.o());
        g6VarNewBuilder.setDevice((BidToken$ClientBidTokenComponents.Device) h6VarNewBuilder.build());
        w5 w5VarNewBuilder = BidToken$ClientBidTokenComponents.AudioInfo.newBuilder();
        j0 j0VarD = clientSignals.o().d();
        if (j0VarD != null) {
            w5VarNewBuilder.setMuteSwitch(a(j0VarD));
        }
        Integer numC = clientSignals.o().c();
        if (numC != null) {
            w5VarNewBuilder.setVol(numC.intValue());
        }
        g6VarNewBuilder.setAudioInfo((BidToken$ClientBidTokenComponents.AudioInfo) w5VarNewBuilder.build());
        s5 s5VarNewBuilder = BidToken$ClientBidTokenComponents.AccessibilityInfo.newBuilder();
        Float fG = clientSignals.l().g();
        if (fG != null) {
            s5VarNewBuilder.setFontScale(fG.floatValue());
        }
        Boolean boolF2 = clientSignals.l().f();
        if (boolF2 != null) {
            s5VarNewBuilder.setAccessibilityLargePointerIcon(boolF2.booleanValue());
        }
        Boolean boolE = clientSignals.l().e();
        if (boolE != null) {
            s5VarNewBuilder.setAccessibilityCaptioningEnabled(boolE.booleanValue());
        }
        Boolean boolH = clientSignals.l().h();
        if (boolH != null) {
            s5VarNewBuilder.setReduceBrightColorsActivated(boolH.booleanValue());
        }
        g6VarNewBuilder.setAccessibilityInfo((BidToken$ClientBidTokenComponents.AccessibilityInfo) s5VarNewBuilder.build());
        if (clientSignals.r().q()) {
            q6 q6VarNewBuilder = BidToken$ClientBidTokenComponents.ImpLvlRevData.newBuilder();
            q6VarNewBuilder.setSessionId(clientSignals.r().o());
            q6VarNewBuilder.setLastImpTs(clientSignals.r().k());
            q6VarNewBuilder.setSessionStartTs(clientSignals.r().p());
            r6 r6VarNewBuilder = BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts.newBuilder();
            r6VarNewBuilder.setBanner(clientSignals.r().i());
            r6VarNewBuilder.setMrec(clientSignals.r().l());
            r6VarNewBuilder.setNative(clientSignals.r().m());
            r6VarNewBuilder.setInterstitial(clientSignals.r().j());
            r6VarNewBuilder.setRewarded(clientSignals.r().n());
            q6VarNewBuilder.setImpCounts((BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts) r6VarNewBuilder.build());
            g6VarNewBuilder.setImpLvlRevData((BidToken$ClientBidTokenComponents.ImpLvlRevData) q6VarNewBuilder.build());
        }
        GeneratedMessageLite generatedMessageLiteBuild = g6VarNewBuilder.build();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
        return (BidToken$ClientBidTokenComponents) generatedMessageLiteBuild;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.q
    public BidToken$ClientBidToken a(byte[] payload) throws InvalidProtocolBufferException {
        kotlin.jvm.internal.e0.checkNotNullParameter(payload, "payload");
        BidToken$ClientBidToken from = BidToken$ClientBidToken.parseFrom(payload);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(from, "parseFrom(...)");
        return from;
    }

    public final k6 a(com.moloco.sdk.internal.services.h hVar) {
        int i10 = r.f46938a[hVar.ordinal()];
        if (i10 == 1) {
            return k6.UNKNOWN;
        }
        if (i10 == 2) {
            return k6.PORTRAIT;
        }
        if (i10 == 3) {
            return k6.LANDSCAPE;
        }
        throw new tu.t();
    }

    public final z5 a(j0 j0Var) {
        int i10 = r.f46939b[j0Var.ordinal()];
        if (i10 == 1) {
            return z5.SILENT;
        }
        if (i10 == 2) {
            return z5.VIBRATE;
        }
        if (i10 == 3) {
            return z5.NORMAL;
        }
        throw new tu.t();
    }
}
