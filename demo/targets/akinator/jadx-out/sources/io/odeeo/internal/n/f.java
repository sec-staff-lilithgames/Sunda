package io.odeeo.internal.n;

import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import h2.rl.UeklptUrP;
import io.odeeo.internal.b.t;
import io.odeeo.internal.g.r;
import io.odeeo.internal.q0.p;
import io.odeeo.internal.q0.x;
import io.odeeo.internal.s.a;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f64819a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", TJzY.geVc, "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", QFzuMMDfrzagDN.GBXoqEEXFiW, "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", UeklptUrP.FfR, "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", UeklptUrP.lUmwYpnHKNidQI, "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static io.odeeo.internal.x.e a(int i10, x xVar) {
        int i11 = xVar.readInt();
        if (xVar.readInt() == 1684108385) {
            xVar.skipBytes(8);
            String nullTerminatedString = xVar.readNullTerminatedString(i11 - 16);
            return new io.odeeo.internal.x.e(C.LANGUAGE_UNDETERMINED, nullTerminatedString, nullTerminatedString);
        }
        p.w(LJjmO.wLWgVHzUIOI, "Failed to parse comment attribute: " + a.getAtomTypeString(i10));
        return null;
    }

    public static io.odeeo.internal.x.l b(int i10, String str, x xVar) {
        int i11 = xVar.readInt();
        if (xVar.readInt() == 1684108385) {
            xVar.skipBytes(8);
            return new io.odeeo.internal.x.l(str, null, xVar.readNullTerminatedString(i11 - 16));
        }
        p.w("MetadataUtil", "Failed to parse text attribute: " + a.getAtomTypeString(i10));
        return null;
    }

    public static int c(x xVar) {
        xVar.skipBytes(4);
        if (xVar.readInt() == 1684108385) {
            xVar.skipBytes(8);
            return xVar.readUnsignedByte();
        }
        p.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static a.b parseIlstElement(x xVar) {
        int i10 = xVar.readInt() + xVar.getPosition();
        int i11 = xVar.readInt();
        int i12 = (i11 >> 24) & 255;
        try {
            if (i12 == 169 || i12 == 253) {
                int i13 = 16777215 & i11;
                if (i13 == 6516084) {
                    return a(i11, xVar);
                }
                if (i13 == 7233901 || i13 == 7631467) {
                    return b(i11, "TIT2", xVar);
                }
                if (i13 == 6516589 || i13 == 7828084) {
                    return b(i11, "TCOM", xVar);
                }
                if (i13 == 6578553) {
                    return b(i11, "TDRC", xVar);
                }
                if (i13 == 4280916) {
                    return b(i11, "TPE1", xVar);
                }
                if (i13 == 7630703) {
                    return b(i11, "TSSE", xVar);
                }
                if (i13 == 6384738) {
                    return b(i11, "TALB", xVar);
                }
                if (i13 == 7108978) {
                    return b(i11, "USLT", xVar);
                }
                if (i13 == 6776174) {
                    return b(i11, "TCON", xVar);
                }
                if (i13 == 6779504) {
                    return b(i11, "TIT1", xVar);
                }
            } else {
                if (i11 == 1735291493) {
                    return b(xVar);
                }
                if (i11 == 1684632427) {
                    return a(i11, "TPOS", xVar);
                }
                if (i11 == 1953655662) {
                    return a(i11, "TRCK", xVar);
                }
                if (i11 == 1953329263) {
                    return a(i11, "TBPM", xVar, true, false);
                }
                if (i11 == 1668311404) {
                    return a(i11, "TCMP", xVar, true, true);
                }
                if (i11 == 1668249202) {
                    return a(xVar);
                }
                if (i11 == 1631670868) {
                    return b(i11, "TPE2", xVar);
                }
                if (i11 == 1936682605) {
                    return b(i11, "TSOT", xVar);
                }
                if (i11 == 1936679276) {
                    return b(i11, "TSO2", xVar);
                }
                if (i11 == 1936679282) {
                    return b(i11, "TSOA", xVar);
                }
                if (i11 == 1936679265) {
                    return b(i11, "TSOP", xVar);
                }
                if (i11 == 1936679791) {
                    return b(i11, "TSOC", xVar);
                }
                if (i11 == 1920233063) {
                    return a(i11, "ITUNESADVISORY", xVar, false, false);
                }
                if (i11 == 1885823344) {
                    return a(i11, "ITUNESGAPLESS", xVar, false, true);
                }
                if (i11 == 1936683886) {
                    return b(i11, "TVSHOWSORT", xVar);
                }
                if (i11 == 1953919848) {
                    return b(i11, "TVSHOW", xVar);
                }
                if (i11 == 757935405) {
                    return a(xVar, i10);
                }
            }
            p.d("MetadataUtil", "Skipped unknown metadata entry: " + a.getAtomTypeString(i11));
            xVar.setPosition(i10);
            return null;
        } finally {
            xVar.setPosition(i10);
        }
    }

    public static io.odeeo.internal.y.a parseMdtaMetadataEntryFromIlst(x xVar, int i10, String str) {
        while (true) {
            int position = xVar.getPosition();
            if (position >= i10) {
                return null;
            }
            int i11 = xVar.readInt();
            if (xVar.readInt() == 1684108385) {
                int i12 = xVar.readInt();
                int i13 = xVar.readInt();
                int i14 = i11 - 16;
                byte[] bArr = new byte[i14];
                xVar.readBytes(bArr, 0, i14);
                return new io.odeeo.internal.y.a(str, bArr, i13, i12);
            }
            xVar.setPosition(position + i11);
        }
    }

    public static void setFormatGaplessInfo(int i10, r rVar, t.b bVar) {
        if (i10 == 1 && rVar.hasGaplessInfo()) {
            bVar.setEncoderDelay(rVar.f64164a).setEncoderPadding(rVar.f64165b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void setFormatMetadata(int r5, io.odeeo.internal.s.a r6, io.odeeo.internal.s.a r7, io.odeeo.internal.b.t.b r8, io.odeeo.internal.s.a... r9) {
        /*
            io.odeeo.internal.s.a r0 = new io.odeeo.internal.s.a
            r1 = 0
            io.odeeo.internal.s.a$b[] r2 = new io.odeeo.internal.s.a.b[r1]
            r0.<init>(r2)
            r2 = 1
            if (r5 != r2) goto Le
            if (r6 == 0) goto L3c
            goto L3d
        Le:
            r6 = 2
            if (r5 != r6) goto L3c
            if (r7 == 0) goto L3c
            r5 = r1
        L14:
            int r6 = r7.length()
            if (r5 >= r6) goto L3c
            io.odeeo.internal.s.a$b r6 = r7.get(r5)
            boolean r3 = r6 instanceof io.odeeo.internal.y.a
            if (r3 == 0) goto L39
            io.odeeo.internal.y.a r6 = (io.odeeo.internal.y.a) r6
            java.lang.String r3 = r6.f67526a
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            io.odeeo.internal.s.a r5 = new io.odeeo.internal.s.a
            io.odeeo.internal.s.a$b[] r7 = new io.odeeo.internal.s.a.b[r2]
            r7[r1] = r6
            r5.<init>(r7)
            r6 = r5
            goto L3d
        L39:
            int r5 = r5 + 1
            goto L14
        L3c:
            r6 = r0
        L3d:
            int r5 = r9.length
        L3e:
            if (r1 >= r5) goto L49
            r7 = r9[r1]
            io.odeeo.internal.s.a r6 = r6.copyWithAppendedEntriesFrom(r7)
            int r1 = r1 + 1
            goto L3e
        L49:
            int r5 = r6.length()
            if (r5 <= 0) goto L52
            r8.setMetadata(r6)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.n.f.setFormatMetadata(int, io.odeeo.internal.s.a, io.odeeo.internal.s.a, io.odeeo.internal.b.t$b, io.odeeo.internal.s.a[]):void");
    }

    public static io.odeeo.internal.x.h a(int i10, String str, x xVar, boolean z10, boolean z11) {
        int iC = c(xVar);
        if (z11) {
            iC = Math.min(1, iC);
        }
        if (iC >= 0) {
            if (z10) {
                return new io.odeeo.internal.x.l(str, null, Integer.toString(iC));
            }
            return new io.odeeo.internal.x.e(C.LANGUAGE_UNDETERMINED, str, Integer.toString(iC));
        }
        p.w("MetadataUtil", "Failed to parse uint8 attribute: " + a.getAtomTypeString(i10));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.odeeo.internal.x.l b(io.odeeo.internal.q0.x r3) {
        /*
            int r3 = c(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = io.odeeo.internal.n.f.f64819a
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L1c
            io.odeeo.internal.x.l r1 = new io.odeeo.internal.x.l
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L1c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            io.odeeo.internal.q0.p.w(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.n.f.b(io.odeeo.internal.q0.x):io.odeeo.internal.x.l");
    }

    public static io.odeeo.internal.x.l a(int i10, String str, x xVar) {
        int i11 = xVar.readInt();
        if (xVar.readInt() == 1684108385 && i11 >= 22) {
            xVar.skipBytes(10);
            int unsignedShort = xVar.readUnsignedShort();
            if (unsignedShort > 0) {
                String strE = a.b.e(unsignedShort, "");
                int unsignedShort2 = xVar.readUnsignedShort();
                if (unsignedShort2 > 0) {
                    strE = o2.g(unsignedShort2, strE, "/");
                }
                return new io.odeeo.internal.x.l(str, null, strE);
            }
        }
        p.w("MetadataUtil", "Failed to parse index/count attribute: " + a.getAtomTypeString(i10));
        return null;
    }

    public static io.odeeo.internal.x.a a(x xVar) {
        String str;
        int i10 = xVar.readInt();
        if (xVar.readInt() == 1684108385) {
            int fullAtomFlags = a.parseFullAtomFlags(xVar.readInt());
            if (fullAtomFlags == 13) {
                str = "image/jpeg";
            } else {
                str = fullAtomFlags == 14 ? "image/png" : null;
            }
            if (str == null) {
                e3.g.z(fullAtomFlags, "Unrecognized cover art flags: ", "MetadataUtil");
                return null;
            }
            xVar.skipBytes(4);
            int i11 = i10 - 16;
            byte[] bArr = new byte[i11];
            xVar.readBytes(bArr, 0, i11);
            return new io.odeeo.internal.x.a(str, null, 3, bArr);
        }
        p.w("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static io.odeeo.internal.x.h a(x xVar, int i10) {
        String nullTerminatedString = null;
        String nullTerminatedString2 = null;
        int i11 = -1;
        int i12 = -1;
        while (xVar.getPosition() < i10) {
            int position = xVar.getPosition();
            int i13 = xVar.readInt();
            int i14 = xVar.readInt();
            xVar.skipBytes(4);
            if (i14 == 1835360622) {
                nullTerminatedString = xVar.readNullTerminatedString(i13 - 12);
            } else if (i14 == 1851878757) {
                nullTerminatedString2 = xVar.readNullTerminatedString(i13 - 12);
            } else {
                if (i14 == 1684108385) {
                    i11 = position;
                    i12 = i13;
                }
                xVar.skipBytes(i13 - 12);
            }
        }
        if (nullTerminatedString == null || nullTerminatedString2 == null || i11 == -1) {
            return null;
        }
        xVar.setPosition(i11);
        xVar.skipBytes(16);
        return new io.odeeo.internal.x.i(nullTerminatedString, nullTerminatedString2, xVar.readNullTerminatedString(i12 - 16));
    }
}
