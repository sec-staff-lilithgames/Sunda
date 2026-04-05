package me;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.y0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.beta.xyn.RnJusJ;
import ee.c0;
import j1.o2;
import nh.b5;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f74432a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", RnJusJ.BtvpQJKWjT, "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", QpyI.qZjIeSiQTEyw, "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static CommentFrame a(int i10, v0 v0Var) {
        int i11 = v0Var.readInt();
        if (v0Var.readInt() == 1684108385) {
            v0Var.skipBytes(8);
            String nullTerminatedString = v0Var.readNullTerminatedString(i11 - 16);
            return new CommentFrame(C.LANGUAGE_UNDETERMINED, nullTerminatedString, nullTerminatedString);
        }
        f0.w("MetadataUtil", "Failed to parse comment attribute: " + a.getAtomTypeString(i10));
        return null;
    }

    public static ApicFrame b(v0 v0Var) {
        int i10 = v0Var.readInt();
        if (v0Var.readInt() != 1684108385) {
            f0.w("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int fullAtomFlags = a.parseFullAtomFlags(v0Var.readInt());
        String str = fullAtomFlags == 13 ? "image/jpeg" : fullAtomFlags == 14 ? "image/png" : null;
        if (str == null) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.p(fullAtomFlags, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        v0Var.skipBytes(4);
        int i11 = i10 - 16;
        byte[] bArr = new byte[i11];
        v0Var.readBytes(bArr, 0, i11);
        return new ApicFrame(str, null, 3, bArr);
    }

    public static TextInformationFrame c(v0 v0Var, int i10, String str) {
        int i11 = v0Var.readInt();
        if (v0Var.readInt() == 1684108385 && i11 >= 22) {
            v0Var.skipBytes(10);
            int unsignedShort = v0Var.readUnsignedShort();
            if (unsignedShort > 0) {
                String strE = a.b.e(unsignedShort, "");
                int unsignedShort2 = v0Var.readUnsignedShort();
                if (unsignedShort2 > 0) {
                    strE = o2.g(unsignedShort2, strE, "/");
                }
                return new TextInformationFrame(str, (String) null, b5.of(strE));
            }
        }
        f0.w("MetadataUtil", "Failed to parse index/count attribute: " + a.getAtomTypeString(i10));
        return null;
    }

    public static TextInformationFrame d(v0 v0Var, int i10, String str) {
        int i11 = v0Var.readInt();
        if (v0Var.readInt() == 1684108385) {
            v0Var.skipBytes(8);
            return new TextInformationFrame(str, (String) null, b5.of(v0Var.readNullTerminatedString(i11 - 16)));
        }
        f0.w("MetadataUtil", "Failed to parse text attribute: " + a.getAtomTypeString(i10));
        return null;
    }

    public static Id3Frame e(int i10, String str, v0 v0Var, boolean z10, boolean z11) {
        int iF = f(v0Var);
        if (z11) {
            iF = Math.min(1, iF);
        }
        if (iF >= 0) {
            return z10 ? new TextInformationFrame(str, (String) null, b5.of(Integer.toString(iF))) : new CommentFrame(C.LANGUAGE_UNDETERMINED, str, Integer.toString(iF));
        }
        f0.w("MetadataUtil", "Failed to parse uint8 attribute: " + a.getAtomTypeString(i10));
        return null;
    }

    public static int f(v0 v0Var) {
        v0Var.skipBytes(4);
        if (v0Var.readInt() == 1684108385) {
            v0Var.skipBytes(8);
            return v0Var.readUnsignedByte();
        }
        f0.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.metadata.Metadata.Entry parseIlstElement(com.google.android.exoplayer2.util.v0 r11) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.p.parseIlstElement(com.google.android.exoplayer2.util.v0):com.google.android.exoplayer2.metadata.Metadata$Entry");
    }

    public static MdtaMetadataEntry parseMdtaMetadataEntryFromIlst(v0 v0Var, int i10, String str) {
        while (true) {
            int position = v0Var.getPosition();
            if (position >= i10) {
                return null;
            }
            int i11 = v0Var.readInt();
            if (v0Var.readInt() == 1684108385) {
                int i12 = v0Var.readInt();
                int i13 = v0Var.readInt();
                int i14 = i11 - 16;
                byte[] bArr = new byte[i14];
                v0Var.readBytes(bArr, 0, i14);
                return new MdtaMetadataEntry(str, bArr, i13, i12);
            }
            v0Var.setPosition(position + i11);
        }
    }

    public static void setFormatGaplessInfo(int i10, c0 c0Var, y0 y0Var) {
        if (i10 == 1 && c0Var.hasGaplessInfo()) {
            y0Var.setEncoderDelay(c0Var.f54177a).setEncoderPadding(c0Var.f54178b);
        }
    }

    public static void setFormatMetadata(int i10, Metadata metadata, Metadata metadata2, y0 y0Var, Metadata... metadataArr) {
        Metadata metadata3 = new Metadata(new Metadata.Entry[0]);
        if (i10 != 1 || metadata == null) {
            metadata = metadata3;
        }
        if (metadata2 != null) {
            for (int i11 = 0; i11 < metadata2.length(); i11++) {
                Metadata.Entry entry = metadata2.get(i11);
                if (entry instanceof MdtaMetadataEntry) {
                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entry;
                    if (!mdtaMetadataEntry.f27778b.equals("com.android.capture.fps")) {
                        metadata = metadata.copyWithAppendedEntries(mdtaMetadataEntry);
                    } else if (i10 == 2) {
                        metadata = metadata.copyWithAppendedEntries(mdtaMetadataEntry);
                    }
                }
            }
        }
        for (Metadata metadata4 : metadataArr) {
            metadata = metadata.copyWithAppendedEntriesFrom(metadata4);
        }
        if (metadata.length() > 0) {
            y0Var.setMetadata(metadata);
        }
    }
}
