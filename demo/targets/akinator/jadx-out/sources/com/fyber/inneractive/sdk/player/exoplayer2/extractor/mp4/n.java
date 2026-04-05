package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.C3161ca;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;
import hr.kNq.ikJMrW;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final int f25120a = z.a("nam");

    /* renamed from: b, reason: collision with root package name */
    public static final int f25121b = z.a("trk");

    /* renamed from: c, reason: collision with root package name */
    public static final int f25122c = z.a("cmt");

    /* renamed from: d, reason: collision with root package name */
    public static final int f25123d = z.a("day");

    /* renamed from: e, reason: collision with root package name */
    public static final int f25124e = z.a("ART");

    /* renamed from: f, reason: collision with root package name */
    public static final int f25125f = z.a("too");

    /* renamed from: g, reason: collision with root package name */
    public static final int f25126g = z.a("alb");

    /* renamed from: h, reason: collision with root package name */
    public static final int f25127h = z.a("com");

    /* renamed from: i, reason: collision with root package name */
    public static final int f25128i = z.a("wrt");

    /* renamed from: j, reason: collision with root package name */
    public static final int f25129j = z.a("lyr");

    /* renamed from: k, reason: collision with root package name */
    public static final int f25130k = z.a(C3161ca.f36142n);

    /* renamed from: l, reason: collision with root package name */
    public static final int f25131l = z.a("covr");

    /* renamed from: m, reason: collision with root package name */
    public static final int f25132m = z.a("gnre");

    /* renamed from: n, reason: collision with root package name */
    public static final int f25133n = z.a("grp");

    /* renamed from: o, reason: collision with root package name */
    public static final int f25134o = z.a("disk");

    /* renamed from: p, reason: collision with root package name */
    public static final int f25135p = z.a("trkn");

    /* renamed from: q, reason: collision with root package name */
    public static final int f25136q = z.a("tmpo");

    /* renamed from: r, reason: collision with root package name */
    public static final int f25137r = z.a("cpil");

    /* renamed from: s, reason: collision with root package name */
    public static final int f25138s = z.a("aART");

    /* renamed from: t, reason: collision with root package name */
    public static final int f25139t = z.a("sonm");

    /* renamed from: u, reason: collision with root package name */
    public static final int f25140u = z.a("soal");

    /* renamed from: v, reason: collision with root package name */
    public static final int f25141v = z.a("soar");

    /* renamed from: w, reason: collision with root package name */
    public static final int f25142w = z.a("soaa");

    /* renamed from: x, reason: collision with root package name */
    public static final int f25143x = z.a("soco");

    /* renamed from: y, reason: collision with root package name */
    public static final int f25144y = z.a("rtng");

    /* renamed from: z, reason: collision with root package name */
    public static final int f25145z = z.a("pgap");
    public static final int A = z.a("sosn");
    public static final int B = z.a("tvsh");
    public static final int C = z.a(InternalFrame.ID);
    public static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o a(int i10, String str, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z10, boolean z11) {
        int iMin;
        nVar.e(nVar.f26043b + 4);
        if (nVar.b() == c.F0) {
            nVar.e(nVar.f26043b + 8);
            iMin = nVar.j();
        } else {
            Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
            iMin = -1;
        }
        if (z11) {
            iMin = Math.min(1, iMin);
        }
        if (iMin >= 0) {
            return z10 ? new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s(str, null, Integer.toString(iMin)) : new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j(C.LANGUAGE_UNDETERMINED, str, Integer.toString(iMin));
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute: " + c.a(i10));
        return null;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j b(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        String strA = null;
        String strA2 = null;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            int i13 = nVar.f26043b;
            if (i13 >= i10) {
                break;
            }
            int iB = nVar.b();
            int iB2 = nVar.b();
            nVar.e(nVar.f26043b + 4);
            if (iB2 == c.D0) {
                strA = nVar.a(iB - 12);
            } else if (iB2 == c.E0) {
                strA2 = nVar.a(iB - 12);
            } else {
                if (iB2 == c.F0) {
                    i11 = i13;
                    i12 = iB;
                }
                nVar.e(nVar.f26043b + (iB - 12));
            }
        }
        if (!"com.apple.iTunes".equals(strA) || !"iTunSMPB".equals(strA2) || i11 == -1) {
            return null;
        }
        nVar.e(i11);
        nVar.e(nVar.f26043b + 16);
        return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j(ikJMrW.SZyk, strA2, nVar.a(i12 - 16));
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int iB = nVar.b();
        if (nVar.b() == c.F0) {
            nVar.e(nVar.f26043b + 8);
            String strA = nVar.a(iB - 16);
            return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j(C.LANGUAGE_UNDETERMINED, strA, strA);
        }
        Log.w("MetadataUtil", "Failed to parse comment attribute: " + c.a(i10));
        return null;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s b(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, String str) {
        int iB = nVar.b();
        if (nVar.b() == c.F0) {
            nVar.e(nVar.f26043b + 8);
            return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s(str, null, nVar.a(iB - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: " + c.a(i10));
        return null;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, String str) {
        int iB = nVar.b();
        if (nVar.b() == c.F0 && iB >= 22) {
            nVar.e(nVar.f26043b + 10);
            int iO = nVar.o();
            if (iO > 0) {
                String strA = com.fyber.inneractive.sdk.player.exoplayer2.m.a("", iO);
                int iO2 = nVar.o();
                if (iO2 > 0) {
                    strA = o2.g(iO2, strA, "/");
                }
                return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s(str, null, strA);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: " + c.a(i10));
        return null;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        String str;
        int iB = nVar.b();
        if (nVar.b() == c.F0) {
            int iB2 = nVar.b() & 16777215;
            if (iB2 == 13) {
                str = "image/jpeg";
            } else {
                str = iB2 == 14 ? "image/png" : null;
            }
            if (str == null) {
                o2.u(iB2, "Unrecognized cover art flags: ", "MetadataUtil");
                return null;
            }
            nVar.e(nVar.f26043b + 4);
            int i10 = iB - 16;
            byte[] bArr = new byte[i10];
            nVar.a(bArr, 0, i10);
            return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b(str, null, 3, bArr);
        }
        Log.w("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }
}
