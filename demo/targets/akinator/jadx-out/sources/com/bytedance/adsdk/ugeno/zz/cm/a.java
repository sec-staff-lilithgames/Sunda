package com.bytedance.adsdk.ugeno.zz.cm;

import android.content.pm.ApkChecksum;
import android.graphics.drawable.AnimatedImageDrawable;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.b1;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.f1;
import com.google.android.exoplayer2.f3;
import com.google.android.exoplayer2.g1;
import com.google.android.exoplayer2.h;
import com.google.android.exoplayer2.i;
import com.google.android.exoplayer2.i1;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.i3;
import com.google.android.exoplayer2.j1;
import com.google.android.exoplayer2.k1;
import com.google.android.exoplayer2.k3;
import com.google.android.exoplayer2.l1;
import com.google.android.exoplayer2.l3;
import com.google.android.exoplayer2.m1;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n1;
import com.google.android.exoplayer2.n3;
import com.google.android.exoplayer2.o1;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.p1;
import com.google.android.exoplayer2.p2;
import com.google.android.exoplayer2.q1;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.r0;
import com.google.android.exoplayer2.s1;
import com.google.android.exoplayer2.t1;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.util.a0;
import com.google.android.exoplayer2.util.c;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.w1;
import com.google.android.exoplayer2.x0;
import com.google.android.exoplayer2.x2;
import com.google.android.exoplayer2.y0;
import com.google.android.exoplayer2.z0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import nh.b5;
import sf.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements a0, h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18059b;

    public /* synthetic */ a(int i10) {
        this.f18059b = i10;
    }

    public static /* bridge */ /* synthetic */ ApkChecksum a(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* bridge */ /* synthetic */ AnimatedImageDrawable b(Object obj) {
        return (AnimatedImageDrawable) obj;
    }

    public static /* bridge */ /* synthetic */ boolean d(Object obj) {
        return obj instanceof AnimatedImageDrawable;
    }

    @Override // com.google.android.exoplayer2.h
    public i fromBundle(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        int i10 = 0;
        switch (this.f18059b) {
            case 7:
                y0 y0Var = new y0();
                c.ensureClassLoader(bundle);
                String string = bundle.getString(z0.L);
                z0 z0Var = z0.K;
                String str = z0Var.f28791b;
                if (string == null) {
                    string = str;
                }
                y0 id2 = y0Var.setId(string);
                String string2 = bundle.getString(z0.M);
                String str2 = z0Var.f28792c;
                if (string2 == null) {
                    string2 = str2;
                }
                y0 label = id2.setLabel(string2);
                String string3 = bundle.getString(z0.N);
                String str3 = z0Var.f28793e;
                if (string3 == null) {
                    string3 = str3;
                }
                y0 peakBitrate = label.setLanguage(string3).setSelectionFlags(bundle.getInt(z0.O, z0Var.f28794f)).setRoleFlags(bundle.getInt(z0.P, z0Var.f28795g)).setAverageBitrate(bundle.getInt(z0.Q, z0Var.f28796h)).setPeakBitrate(bundle.getInt(z0.R, z0Var.f28797i));
                String string4 = bundle.getString(z0.S);
                String str4 = z0Var.f28799k;
                if (string4 == null) {
                    string4 = str4;
                }
                y0 codecs = peakBitrate.setCodecs(string4);
                Metadata metadata = (Metadata) bundle.getParcelable(z0.T);
                Metadata metadata2 = z0Var.f28800l;
                if (metadata == null) {
                    metadata = metadata2;
                }
                y0 metadata3 = codecs.setMetadata(metadata);
                String string5 = bundle.getString(z0.U);
                String str5 = z0Var.f28801m;
                if (string5 == null) {
                    string5 = str5;
                }
                y0 containerMimeType = metadata3.setContainerMimeType(string5);
                String string6 = bundle.getString(z0.V);
                String str6 = z0Var.f28802n;
                if (string6 == null) {
                    string6 = str6;
                }
                containerMimeType.setSampleMimeType(string6).setMaxInputSize(bundle.getInt(z0.W, z0Var.f28803o));
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(z0.X + "_" + Integer.toString(i10, 36));
                    if (byteArray == null) {
                        y0Var.setInitializationData(arrayList).setDrmInitData((DrmInitData) bundle.getParcelable(z0.Y)).setSubsampleOffsetUs(bundle.getLong(z0.Z, z0Var.f28806r)).setWidth(bundle.getInt(z0.f28773a0, z0Var.f28807s)).setHeight(bundle.getInt(z0.f28774b0, z0Var.f28808t)).setFrameRate(bundle.getFloat(z0.f28775c0, z0Var.f28809u)).setRotationDegrees(bundle.getInt(z0.f28776d0, z0Var.f28810v)).setPixelWidthHeightRatio(bundle.getFloat(z0.f28777e0, z0Var.f28811w)).setProjectionData(bundle.getByteArray(z0.f28778f0)).setStereoMode(bundle.getInt(z0.f28779g0, z0Var.f28813y));
                        Bundle bundle4 = bundle.getBundle(z0.f28780h0);
                        if (bundle4 != null) {
                            y0Var.setColorInfo((b) b.f85611m.fromBundle(bundle4));
                        }
                        y0Var.setChannelCount(bundle.getInt(z0.f28781i0, z0Var.A)).setSampleRate(bundle.getInt(z0.f28782j0, z0Var.B)).setPcmEncoding(bundle.getInt(z0.f28783k0, z0Var.C)).setEncoderDelay(bundle.getInt(z0.f28784l0, z0Var.D)).setEncoderPadding(bundle.getInt(z0.f28785m0, z0Var.E)).setAccessibilityChannel(bundle.getInt(z0.f28786n0, z0Var.F)).setTileCountHorizontal(bundle.getInt(z0.f28788p0, z0Var.G)).setTileCountVertical(bundle.getInt(z0.f28789q0, z0Var.H)).setCryptoType(bundle.getInt(z0.f28787o0, z0Var.I));
                        return y0Var.build();
                    }
                    arrayList.add(byteArray);
                    i10++;
                }
            case 8:
                String str7 = b1.f27334g;
                com.google.android.exoplayer2.util.a.checkArgument(bundle.getInt(x2.f28710b, -1) == 0);
                return bundle.getBoolean(b1.f27334g, false) ? new b1(bundle.getBoolean(b1.f27335h, false)) : new b1();
            case 9:
                String str8 = (String) com.google.android.exoplayer2.util.a.checkNotNull(bundle.getString(u1.f28105j, ""));
                Bundle bundle5 = bundle.getBundle(u1.f28106k);
                n1 n1Var = bundle5 == null ? n1.f27812h : (n1) n1.f27818n.fromBundle(bundle5);
                Bundle bundle6 = bundle.getBundle(u1.f28107l);
                w1 w1Var = bundle6 == null ? w1.K : (w1) w1.f28662s0.fromBundle(bundle6);
                Bundle bundle7 = bundle.getBundle(u1.f28108m);
                k1 k1Var = bundle7 == null ? k1.f27570o : (k1) j1.f27547n.fromBundle(bundle7);
                Bundle bundle8 = bundle.getBundle(u1.f28109n);
                q1 q1Var = bundle8 == null ? q1.f27924f : (q1) q1.f27928j.fromBundle(bundle8);
                Bundle bundle9 = bundle.getBundle(u1.f28110o);
                return new u1(str8, k1Var, bundle9 != null ? (o1) o1.f27859r.fromBundle(bundle9) : null, n1Var, w1Var, q1Var);
            case 10:
                Uri uri = (Uri) bundle.getParcelable(g1.f27496e);
                com.google.android.exoplayer2.util.a.checkNotNull(uri);
                return new f1(uri).build();
            case 11:
                i1 i1Var = new i1();
                String str9 = j1.f27542i;
                j1 j1Var = j1.f27541h;
                return i1Var.setStartPositionMs(bundle.getLong(str9, j1Var.f27548b)).setEndPositionMs(bundle.getLong(j1.f27543j, j1Var.f27549c)).setRelativeToLiveWindow(bundle.getBoolean(j1.f27544k, j1Var.f27550e)).setRelativeToDefaultPosition(bundle.getBoolean(j1.f27545l, j1Var.f27551f)).setStartsAtKeyFrame(bundle.getBoolean(j1.f27546m, j1Var.f27552g)).buildClippingProperties();
            case 12:
                return new l1(UUID.fromString((String) com.google.android.exoplayer2.util.a.checkNotNull(bundle.getString(m1.f27676k)))).setLicenseUri((Uri) bundle.getParcelable(m1.f27677l)).setLicenseRequestHeaders(c.bundleToStringImmutableMap(c.getBundleWithDefault(bundle, m1.f27678m, Bundle.EMPTY))).setMultiSession(bundle.getBoolean(m1.f27679n, false)).setForceDefaultLicenseUri(bundle.getBoolean(m1.f27681p, false)).setPlayClearContentWithoutKey(bundle.getBoolean(m1.f27680o, false)).setForcedSessionTrackTypes(b5.copyOf((Collection) c.getIntegerArrayListWithDefault(bundle, m1.f27682q, new ArrayList()))).setKeySetId(bundle.getByteArray(m1.f27683r)).build();
            case 13:
                String str10 = n1.f27813i;
                n1 n1Var2 = n1.f27812h;
                return new n1(bundle.getLong(str10, n1Var2.f27819b), bundle.getLong(n1.f27814j, n1Var2.f27820c), bundle.getLong(n1.f27815k, n1Var2.f27821e), bundle.getFloat(n1.f27816l, n1Var2.f27822f), bundle.getFloat(n1.f27817m, n1Var2.f27823g));
            case 14:
                Bundle bundle10 = bundle.getBundle(o1.f27854m);
                m1 m1Var = bundle10 == null ? null : (m1) m1.f27684s.fromBundle(bundle10);
                Bundle bundle11 = bundle.getBundle(o1.f27855n);
                g1 g1Var = bundle11 != null ? (g1) g1.f27497f.fromBundle(bundle11) : null;
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(o1.f27856o);
                b5 b5VarOf = parcelableArrayList == null ? b5.of() : c.fromBundleList(new a(15), parcelableArrayList);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(o1.f27858q);
                return new o1((Uri) com.google.android.exoplayer2.util.a.checkNotNull((Uri) bundle.getParcelable(o1.f27852k)), bundle.getString(o1.f27853l), m1Var, g1Var, b5VarOf, bundle.getString(o1.f27857p), parcelableArrayList2 == null ? b5.of() : c.fromBundleList(t1.f28046q, parcelableArrayList2), null);
            case 15:
                return StreamKey.fromBundle(bundle);
            case 16:
                return new p1().setMediaUri((Uri) bundle.getParcelable(q1.f27925g)).setSearchQuery(bundle.getString(q1.f27926h)).setExtras(bundle.getBundle(q1.f27927i)).build();
            case 17:
                return new s1((Uri) com.google.android.exoplayer2.util.a.checkNotNull((Uri) bundle.getParcelable(t1.f28039j))).setMimeType(bundle.getString(t1.f28040k)).setLanguage(bundle.getString(t1.f28041l)).setSelectionFlags(bundle.getInt(t1.f28042m, 0)).setRoleFlags(bundle.getInt(t1.f28043n, 0)).setLabel(bundle.getString(t1.f28044o)).setId(bundle.getString(t1.f28045p)).build();
            case 18:
                v1 v1Var = new v1();
                v1 description = v1Var.setTitle(bundle.getCharSequence(w1.L)).setArtist(bundle.getCharSequence(w1.M)).setAlbumTitle(bundle.getCharSequence(w1.N)).setAlbumArtist(bundle.getCharSequence(w1.O)).setDisplayTitle(bundle.getCharSequence(w1.P)).setSubtitle(bundle.getCharSequence(w1.Q)).setDescription(bundle.getCharSequence(w1.R));
                byte[] byteArray2 = bundle.getByteArray(w1.U);
                String str11 = w1.f28657n0;
                description.setArtworkData(byteArray2, bundle.containsKey(str11) ? Integer.valueOf(bundle.getInt(str11)) : null).setArtworkUri((Uri) bundle.getParcelable(w1.V)).setWriter(bundle.getCharSequence(w1.f28650g0)).setComposer(bundle.getCharSequence(w1.f28651h0)).setConductor(bundle.getCharSequence(w1.f28652i0)).setGenre(bundle.getCharSequence(w1.f28655l0)).setCompilation(bundle.getCharSequence(w1.f28656m0)).setStation(bundle.getCharSequence(w1.f28658o0)).setExtras(bundle.getBundle(w1.f28661r0));
                String str12 = w1.S;
                if (bundle.containsKey(str12) && (bundle3 = bundle.getBundle(str12)) != null) {
                    v1Var.setUserRating((x2) x2.f28711c.fromBundle(bundle3));
                }
                String str13 = w1.T;
                if (bundle.containsKey(str13) && (bundle2 = bundle.getBundle(str13)) != null) {
                    v1Var.setOverallRating((x2) x2.f28711c.fromBundle(bundle2));
                }
                String str14 = w1.W;
                if (bundle.containsKey(str14)) {
                    v1Var.setTrackNumber(Integer.valueOf(bundle.getInt(str14)));
                }
                String str15 = w1.X;
                if (bundle.containsKey(str15)) {
                    v1Var.setTotalTrackCount(Integer.valueOf(bundle.getInt(str15)));
                }
                String str16 = w1.Y;
                if (bundle.containsKey(str16)) {
                    v1Var.setFolderType(Integer.valueOf(bundle.getInt(str16)));
                }
                String str17 = w1.f28660q0;
                if (bundle.containsKey(str17)) {
                    v1Var.setIsBrowsable(Boolean.valueOf(bundle.getBoolean(str17)));
                }
                String str18 = w1.Z;
                if (bundle.containsKey(str18)) {
                    v1Var.setIsPlayable(Boolean.valueOf(bundle.getBoolean(str18)));
                }
                String str19 = w1.f28644a0;
                if (bundle.containsKey(str19)) {
                    v1Var.setRecordingYear(Integer.valueOf(bundle.getInt(str19)));
                }
                String str20 = w1.f28645b0;
                if (bundle.containsKey(str20)) {
                    v1Var.setRecordingMonth(Integer.valueOf(bundle.getInt(str20)));
                }
                String str21 = w1.f28646c0;
                if (bundle.containsKey(str21)) {
                    v1Var.setRecordingDay(Integer.valueOf(bundle.getInt(str21)));
                }
                String str22 = w1.f28647d0;
                if (bundle.containsKey(str22)) {
                    v1Var.setReleaseYear(Integer.valueOf(bundle.getInt(str22)));
                }
                String str23 = w1.f28648e0;
                if (bundle.containsKey(str23)) {
                    v1Var.setReleaseMonth(Integer.valueOf(bundle.getInt(str23)));
                }
                String str24 = w1.f28649f0;
                if (bundle.containsKey(str24)) {
                    v1Var.setReleaseDay(Integer.valueOf(bundle.getInt(str24)));
                }
                String str25 = w1.f28653j0;
                if (bundle.containsKey(str25)) {
                    v1Var.setDiscNumber(Integer.valueOf(bundle.getInt(str25)));
                }
                String str26 = w1.f28654k0;
                if (bundle.containsKey(str26)) {
                    v1Var.setTotalDiscCount(Integer.valueOf(bundle.getInt(str26)));
                }
                String str27 = w1.f28659p0;
                if (bundle.containsKey(str27)) {
                    v1Var.setMediaType(Integer.valueOf(bundle.getInt(str27)));
                }
                return v1Var.build();
            case 19:
                String str28 = i2.f27526f;
                com.google.android.exoplayer2.util.a.checkArgument(bundle.getInt(x2.f28710b, -1) == 1);
                float f10 = bundle.getFloat(i2.f27526f, -1.0f);
                return f10 == -1.0f ? new i2() : new i2(f10);
            case 20:
                int i11 = bundle.getInt(x2.f28710b, -1);
                if (i11 == 0) {
                    return (x2) b1.f27336i.fromBundle(bundle);
                }
                if (i11 == 1) {
                    return (x2) i2.f27527g.fromBundle(bundle);
                }
                if (i11 == 2) {
                    return (x2) f3.f27489i.fromBundle(bundle);
                }
                if (i11 == 3) {
                    return (x2) i3.f27531i.fromBundle(bundle);
                }
                throw new IllegalArgumentException(a.b.e(i11, "Unknown RatingType: "));
            case 21:
                String str29 = f3.f27487g;
                com.google.android.exoplayer2.util.a.checkArgument(bundle.getInt(x2.f28710b, -1) == 2);
                int i12 = bundle.getInt(f3.f27487g, 5);
                float f11 = bundle.getFloat(f3.f27488h, -1.0f);
                return f11 == -1.0f ? new f3(i12) : new f3(i12, f11);
            case 22:
                String str30 = i3.f27529g;
                com.google.android.exoplayer2.util.a.checkArgument(bundle.getInt(x2.f28710b, -1) == 3);
                return bundle.getBoolean(i3.f27529g, false) ? new i3(bundle.getBoolean(i3.f27530h, false)) : new i3();
            case 23:
                int i13 = bundle.getInt(k3.f27591j, 0);
                long j10 = bundle.getLong(k3.f27592k, C.TIME_UNSET);
                long j11 = bundle.getLong(k3.f27593l, 0L);
                boolean z10 = bundle.getBoolean(k3.f27594m, false);
                Bundle bundle12 = bundle.getBundle(k3.f27595n);
                cf.b bVar = bundle12 != null ? (cf.b) cf.b.f12277o.fromBundle(bundle12) : cf.b.f12271i;
                k3 k3Var = new k3();
                k3Var.set(null, null, i13, j10, j11, bVar, z10);
                return k3Var;
            case 24:
                Bundle bundle13 = bundle.getBundle(l3.f27643w);
                u1 u1Var = bundle13 != null ? (u1) u1.f28111p.fromBundle(bundle13) : u1.f28104i;
                long j12 = bundle.getLong(l3.f27644x, C.TIME_UNSET);
                long j13 = bundle.getLong(l3.f27645y, C.TIME_UNSET);
                long j14 = bundle.getLong(l3.f27646z, C.TIME_UNSET);
                boolean z11 = bundle.getBoolean(l3.A, false);
                boolean z12 = bundle.getBoolean(l3.B, false);
                Bundle bundle14 = bundle.getBundle(l3.C);
                n1 n1Var3 = bundle14 != null ? (n1) n1.f27818n.fromBundle(bundle14) : null;
                boolean z13 = bundle.getBoolean(l3.D, false);
                long j15 = bundle.getLong(l3.E, 0L);
                long j16 = bundle.getLong(l3.F, C.TIME_UNSET);
                int i14 = bundle.getInt(l3.G, 0);
                int i15 = bundle.getInt(l3.H, 0);
                long j17 = bundle.getLong(l3.I, 0L);
                l3 l3Var = new l3();
                l3Var.set(l3.f27641u, u1Var, null, j12, j13, j14, z11, z12, n1Var3, j15, j16, i14, i15, j17);
                l3Var.f27658n = z13;
                return l3Var;
            default:
                String str31 = n3.a.f27834h;
                bf.m1 m1Var2 = (bf.m1) bf.m1.f9331j.fromBundle((Bundle) com.google.android.exoplayer2.util.a.checkNotNull(bundle.getBundle(n3.a.f27834h)));
                int[] intArray = bundle.getIntArray(n3.a.f27835i);
                int i16 = m1Var2.f9332b;
                return new n3.a(m1Var2, bundle.getBoolean(n3.a.f27837k, false), (int[]) mh.g1.firstNonNull(intArray, new int[i16]), (boolean[]) mh.g1.firstNonNull(bundle.getBooleanArray(n3.a.f27836j), new boolean[i16]));
        }
    }

    @Override // com.google.android.exoplayer2.util.a0
    public void invoke(Object obj) {
        p2 p2Var = (p2) obj;
        switch (this.f18059b) {
            case 4:
                int i10 = r0.f27961y0;
                p2Var.onPlayerError(r.createForUnexpected(new x0(1), IronSourceError.AUCTION_ERROR_DECRYPTION));
                break;
            default:
                p2Var.onRenderedFirstFrame();
                break;
        }
    }
}
