package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import a.b;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import com.ironsource.C3161ca;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.CommentFrame;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Frame;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.TextInformationFrame;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import com.unity3d.ads.beta.xyn.RnJusJ;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class MetadataUtil {
    private static final String LANGUAGE_UNDEFINED = "und";
    private static final String TAG = "MetadataUtil";
    private static final int SHORT_TYPE_NAME_1 = Util.getIntegerCodeForString("nam");
    private static final int SHORT_TYPE_NAME_2 = Util.getIntegerCodeForString("trk");
    private static final int SHORT_TYPE_COMMENT = Util.getIntegerCodeForString("cmt");
    private static final int SHORT_TYPE_YEAR = Util.getIntegerCodeForString("day");
    private static final int SHORT_TYPE_ARTIST = Util.getIntegerCodeForString("ART");
    private static final int SHORT_TYPE_ENCODER = Util.getIntegerCodeForString("too");
    private static final int SHORT_TYPE_ALBUM = Util.getIntegerCodeForString("alb");
    private static final int SHORT_TYPE_COMPOSER_1 = Util.getIntegerCodeForString("com");
    private static final int SHORT_TYPE_COMPOSER_2 = Util.getIntegerCodeForString("wrt");
    private static final int SHORT_TYPE_LYRICS = Util.getIntegerCodeForString("lyr");
    private static final int SHORT_TYPE_GENRE = Util.getIntegerCodeForString(C3161ca.f36142n);
    private static final int TYPE_COVER_ART = Util.getIntegerCodeForString("covr");
    private static final int TYPE_GENRE = Util.getIntegerCodeForString("gnre");
    private static final int TYPE_GROUPING = Util.getIntegerCodeForString("grp");
    private static final int TYPE_DISK_NUMBER = Util.getIntegerCodeForString("disk");
    private static final int TYPE_TRACK_NUMBER = Util.getIntegerCodeForString("trkn");
    private static final int TYPE_TEMPO = Util.getIntegerCodeForString("tmpo");
    private static final int TYPE_COMPILATION = Util.getIntegerCodeForString("cpil");
    private static final int TYPE_ALBUM_ARTIST = Util.getIntegerCodeForString("aART");
    private static final int TYPE_SORT_TRACK_NAME = Util.getIntegerCodeForString("sonm");
    private static final int TYPE_SORT_ALBUM = Util.getIntegerCodeForString("soal");
    private static final int TYPE_SORT_ARTIST = Util.getIntegerCodeForString("soar");
    private static final int TYPE_SORT_ALBUM_ARTIST = Util.getIntegerCodeForString("soaa");
    private static final int TYPE_SORT_COMPOSER = Util.getIntegerCodeForString("soco");
    private static final int TYPE_RATING = Util.getIntegerCodeForString("rtng");
    private static final int TYPE_GAPLESS_ALBUM = Util.getIntegerCodeForString("pgap");
    private static final int TYPE_TV_SORT_SHOW = Util.getIntegerCodeForString("sosn");
    private static final int TYPE_TV_SHOW = Util.getIntegerCodeForString("tvsh");
    private static final int TYPE_INTERNAL = Util.getIntegerCodeForString(InternalFrame.ID);
    private static final String[] STANDARD_GENRES = {"Blues", NyKZx.YvHODExPcfPe, "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", SUvoXnn.HtX, "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    private MetadataUtil() {
    }

    private static CommentFrame parseCommentAttribute(int i10, ParsableByteArray parsableByteArray) {
        int i11 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == Atom.TYPE_data) {
            parsableByteArray.skipBytes(8);
            String nullTerminatedString = parsableByteArray.readNullTerminatedString(i11 - 16);
            return new CommentFrame("und", nullTerminatedString, nullTerminatedString);
        }
        Log.w(TAG, "Failed to parse comment attribute: " + Atom.getAtomTypeString(i10));
        return null;
    }

    private static ApicFrame parseCoverArt(ParsableByteArray parsableByteArray) {
        int i10 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() != Atom.TYPE_data) {
            Log.w(TAG, "Failed to parse cover art attribute");
            return null;
        }
        int fullAtomFlags = Atom.parseFullAtomFlags(parsableByteArray.readInt());
        String str = fullAtomFlags == 13 ? "image/jpeg" : fullAtomFlags == 14 ? "image/png" : null;
        if (str == null) {
            o2.u(fullAtomFlags, "Unrecognized cover art flags: ", TAG);
            return null;
        }
        parsableByteArray.skipBytes(4);
        int i11 = i10 - 16;
        byte[] bArr = new byte[i11];
        parsableByteArray.readBytes(bArr, 0, i11);
        return new ApicFrame(str, null, 3, bArr);
    }

    private static TextInformationFrame parseIndexAndCountAttribute(int i10, String str, ParsableByteArray parsableByteArray) {
        int i11 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == Atom.TYPE_data && i11 >= 22) {
            parsableByteArray.skipBytes(10);
            int unsignedShort = parsableByteArray.readUnsignedShort();
            if (unsignedShort > 0) {
                String strE = b.e(unsignedShort, "");
                int unsignedShort2 = parsableByteArray.readUnsignedShort();
                if (unsignedShort2 > 0) {
                    strE = o2.g(unsignedShort2, strE, "/");
                }
                return new TextInformationFrame(str, null, strE);
            }
        }
        Log.w(TAG, "Failed to parse index/count attribute: " + Atom.getAtomTypeString(i10));
        return null;
    }

    private static Id3Frame parseInternalAttribute(ParsableByteArray parsableByteArray, int i10) {
        String nullTerminatedString = null;
        String nullTerminatedString2 = null;
        int i11 = -1;
        int i12 = -1;
        while (parsableByteArray.getPosition() < i10) {
            int position = parsableByteArray.getPosition();
            int i13 = parsableByteArray.readInt();
            int i14 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            if (i14 == Atom.TYPE_mean) {
                nullTerminatedString = parsableByteArray.readNullTerminatedString(i13 - 12);
            } else if (i14 == Atom.TYPE_name) {
                nullTerminatedString2 = parsableByteArray.readNullTerminatedString(i13 - 12);
            } else {
                if (i14 == Atom.TYPE_data) {
                    i11 = position;
                    i12 = i13;
                }
                parsableByteArray.skipBytes(i13 - 12);
            }
        }
        if (nullTerminatedString == null || nullTerminatedString2 == null || i11 == -1) {
            return null;
        }
        parsableByteArray.setPosition(i11);
        parsableByteArray.skipBytes(16);
        return new InternalFrame(nullTerminatedString, nullTerminatedString2, parsableByteArray.readNullTerminatedString(i12 - 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.TextInformationFrame parseStandardGenreAttribute(com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray r3) {
        /*
            int r3 = parseUint8AttributeValue(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.MetadataUtil.STANDARD_GENRES
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L1c
            com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.TextInformationFrame r1 = new com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.TextInformationFrame
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L1c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            android.util.Log.w(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.MetadataUtil.parseStandardGenreAttribute(com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray):com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.TextInformationFrame");
    }

    private static TextInformationFrame parseTextAttribute(int i10, String str, ParsableByteArray parsableByteArray) {
        int i11 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == Atom.TYPE_data) {
            parsableByteArray.skipBytes(8);
            return new TextInformationFrame(str, null, parsableByteArray.readNullTerminatedString(i11 - 16));
        }
        Log.w(TAG, "Failed to parse text attribute: " + Atom.getAtomTypeString(i10));
        return null;
    }

    private static Id3Frame parseUint8Attribute(int i10, String str, ParsableByteArray parsableByteArray, boolean z10, boolean z11) {
        int uint8AttributeValue = parseUint8AttributeValue(parsableByteArray);
        if (z11) {
            uint8AttributeValue = Math.min(1, uint8AttributeValue);
        }
        if (uint8AttributeValue >= 0) {
            return z10 ? new TextInformationFrame(str, null, Integer.toString(uint8AttributeValue)) : new CommentFrame("und", str, Integer.toString(uint8AttributeValue));
        }
        Log.w(TAG, "Failed to parse uint8 attribute: " + Atom.getAtomTypeString(i10));
        return null;
    }

    private static int parseUint8AttributeValue(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() == Atom.TYPE_data) {
            parsableByteArray.skipBytes(8);
            return parsableByteArray.readUnsignedByte();
        }
        Log.w(TAG, "Failed to parse uint8 attribute value");
        return -1;
    }

    public static Metadata.Entry parseIlstElement(ParsableByteArray parsableByteArray) {
        int i10 = parsableByteArray.readInt() + parsableByteArray.getPosition();
        int i11 = parsableByteArray.readInt();
        int i12 = (i11 >> 24) & 255;
        try {
            if (i12 == 169 || i12 == 65533) {
                int i13 = 16777215 & i11;
                if (i13 == SHORT_TYPE_COMMENT) {
                    return parseCommentAttribute(i11, parsableByteArray);
                }
                if (i13 != SHORT_TYPE_NAME_1 && i13 != SHORT_TYPE_NAME_2) {
                    if (i13 != SHORT_TYPE_COMPOSER_1 && i13 != SHORT_TYPE_COMPOSER_2) {
                        if (i13 == SHORT_TYPE_YEAR) {
                            return parseTextAttribute(i11, "TDRC", parsableByteArray);
                        }
                        if (i13 == SHORT_TYPE_ARTIST) {
                            return parseTextAttribute(i11, "TPE1", parsableByteArray);
                        }
                        if (i13 == SHORT_TYPE_ENCODER) {
                            return parseTextAttribute(i11, "TSSE", parsableByteArray);
                        }
                        if (i13 == SHORT_TYPE_ALBUM) {
                            return parseTextAttribute(i11, "TALB", parsableByteArray);
                        }
                        if (i13 == SHORT_TYPE_LYRICS) {
                            return parseTextAttribute(i11, RnJusJ.zpOFqiHnN, parsableByteArray);
                        }
                        if (i13 == SHORT_TYPE_GENRE) {
                            return parseTextAttribute(i11, "TCON", parsableByteArray);
                        }
                        if (i13 == TYPE_GROUPING) {
                            return parseTextAttribute(i11, "TIT1", parsableByteArray);
                        }
                    }
                    return parseTextAttribute(i11, "TCOM", parsableByteArray);
                }
                return parseTextAttribute(i11, "TIT2", parsableByteArray);
            }
            if (i11 == TYPE_GENRE) {
                return parseStandardGenreAttribute(parsableByteArray);
            }
            if (i11 == TYPE_DISK_NUMBER) {
                return parseIndexAndCountAttribute(i11, "TPOS", parsableByteArray);
            }
            if (i11 == TYPE_TRACK_NUMBER) {
                return parseIndexAndCountAttribute(i11, "TRCK", parsableByteArray);
            }
            if (i11 == TYPE_TEMPO) {
                return parseUint8Attribute(i11, "TBPM", parsableByteArray, true, false);
            }
            if (i11 == TYPE_COMPILATION) {
                return parseUint8Attribute(i11, "TCMP", parsableByteArray, true, true);
            }
            if (i11 == TYPE_COVER_ART) {
                return parseCoverArt(parsableByteArray);
            }
            if (i11 == TYPE_ALBUM_ARTIST) {
                return parseTextAttribute(i11, "TPE2", parsableByteArray);
            }
            if (i11 == TYPE_SORT_TRACK_NAME) {
                return parseTextAttribute(i11, "TSOT", parsableByteArray);
            }
            if (i11 == TYPE_SORT_ALBUM) {
                return parseTextAttribute(i11, "TSO2", parsableByteArray);
            }
            if (i11 == TYPE_SORT_ARTIST) {
                return parseTextAttribute(i11, "TSOA", parsableByteArray);
            }
            if (i11 == TYPE_SORT_ALBUM_ARTIST) {
                return parseTextAttribute(i11, "TSOP", parsableByteArray);
            }
            if (i11 == TYPE_SORT_COMPOSER) {
                return parseTextAttribute(i11, "TSOC", parsableByteArray);
            }
            if (i11 == TYPE_RATING) {
                return parseUint8Attribute(i11, "ITUNESADVISORY", parsableByteArray, false, false);
            }
            if (i11 == TYPE_GAPLESS_ALBUM) {
                return parseUint8Attribute(i11, "ITUNESGAPLESS", parsableByteArray, false, true);
            }
            if (i11 == TYPE_TV_SORT_SHOW) {
                return parseTextAttribute(i11, "TVSHOWSORT", parsableByteArray);
            }
            if (i11 == TYPE_TV_SHOW) {
                return parseTextAttribute(i11, "TVSHOW", parsableByteArray);
            }
            if (i11 == TYPE_INTERNAL) {
                return parseInternalAttribute(parsableByteArray, i10);
            }
            Log.d(TAG, "Skipped unknown metadata entry: " + Atom.getAtomTypeString(i11));
            parsableByteArray.setPosition(i10);
            return null;
        } finally {
            parsableByteArray.setPosition(i10);
        }
    }
}
