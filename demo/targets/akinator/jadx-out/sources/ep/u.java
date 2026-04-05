package ep;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.t0;
import gn.u0;
import io.bidmachine.media3.common.util.m0;
import j1.o2;
import ko.n0;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class u {
    public static yo.e a(int i10, m0 m0Var) {
        int i11 = m0Var.readInt();
        if (m0Var.readInt() == 1684108385) {
            m0Var.skipBytes(8);
            String nullTerminatedString = m0Var.readNullTerminatedString(i11 - 16);
            return new yo.e(C.LANGUAGE_UNDETERMINED, nullTerminatedString, nullTerminatedString);
        }
        io.bidmachine.media3.common.util.b0.w("MetadataUtil", "Failed to parse comment attribute: " + jn.e.getBoxTypeString(i10));
        return null;
    }

    public static yo.a b(m0 m0Var) {
        int i10 = m0Var.readInt();
        if (m0Var.readInt() != 1684108385) {
            io.bidmachine.media3.common.util.b0.w("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int fullBoxFlags = n.parseFullBoxFlags(m0Var.readInt());
        String str = fullBoxFlags == 13 ? "image/jpeg" : fullBoxFlags == 14 ? "image/png" : null;
        if (str == null) {
            e3.g.t(fullBoxFlags, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        m0Var.skipBytes(4);
        int i11 = i10 - 16;
        byte[] bArr = new byte[i11];
        m0Var.readBytes(bArr, 0, i11);
        return new yo.a(str, null, 3, bArr);
    }

    public static yo.n c(m0 m0Var, int i10, String str) {
        int i11 = m0Var.readInt();
        if (m0Var.readInt() == 1684108385 && i11 >= 22) {
            m0Var.skipBytes(10);
            int unsignedShort = m0Var.readUnsignedShort();
            if (unsignedShort > 0) {
                String strE = a.b.e(unsignedShort, "");
                int unsignedShort2 = m0Var.readUnsignedShort();
                if (unsignedShort2 > 0) {
                    strE = o2.g(unsignedShort2, strE, "/");
                }
                return new yo.n(str, (String) null, b5.of(strE));
            }
        }
        io.bidmachine.media3.common.util.b0.w("MetadataUtil", "Failed to parse index/count attribute: " + jn.e.getBoxTypeString(i10));
        return null;
    }

    public static int d(m0 m0Var) {
        int i10 = m0Var.readInt();
        if (m0Var.readInt() == 1684108385) {
            m0Var.skipBytes(8);
            int i11 = i10 - 16;
            if (i11 == 1) {
                return m0Var.readUnsignedByte();
            }
            if (i11 == 2) {
                return m0Var.readUnsignedShort();
            }
            if (i11 == 3) {
                return m0Var.readUnsignedInt24();
            }
            if (i11 == 4 && (m0Var.peekUnsignedByte() & 128) == 0) {
                return m0Var.readUnsignedIntToInt();
            }
        }
        io.bidmachine.media3.common.util.b0.w("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static yo.i e(int i10, String str, m0 m0Var, boolean z10, boolean z11) {
        int iD = d(m0Var);
        if (z11) {
            iD = Math.min(1, iD);
        }
        if (iD >= 0) {
            return z10 ? new yo.n(str, (String) null, b5.of(Integer.toString(iD))) : new yo.e(C.LANGUAGE_UNDETERMINED, str, Integer.toString(iD));
        }
        io.bidmachine.media3.common.util.b0.w("MetadataUtil", "Failed to parse uint8 attribute: " + jn.e.getBoxTypeString(i10));
        return null;
    }

    public static yo.n f(m0 m0Var, int i10, String str) {
        int i11 = m0Var.readInt();
        if (m0Var.readInt() == 1684108385) {
            m0Var.skipBytes(8);
            return new yo.n(str, (String) null, b5.of(m0Var.readNullTerminatedString(i11 - 16)));
        }
        io.bidmachine.media3.common.util.b0.w("MetadataUtil", "Failed to parse text attribute: " + jn.e.getBoxTypeString(i10));
        return null;
    }

    public static jn.a findMdtaMetadataEntryWithKey(u0 u0Var, String str) {
        for (int i10 = 0; i10 < u0Var.length(); i10++) {
            t0 t0Var = u0Var.get(i10);
            if (t0Var instanceof jn.a) {
                jn.a aVar = (jn.a) t0Var;
                if (aVar.f69709a.equals(str)) {
                    return aVar;
                }
            }
        }
        return null;
    }

    public static t0 parseIlstElement(m0 m0Var) {
        int i10 = m0Var.readInt() + m0Var.getPosition();
        int i11 = m0Var.readInt();
        int i12 = (i11 >> 24) & 255;
        yo.i kVar = null;
        try {
            if (i12 == 169 || i12 == 253) {
                int i13 = 16777215 & i11;
                if (i13 == 6516084) {
                    return a(i11, m0Var);
                }
                if (i13 == 7233901 || i13 == 7631467) {
                    return f(m0Var, i11, "TIT2");
                }
                if (i13 == 6516589 || i13 == 7828084) {
                    return f(m0Var, i11, "TCOM");
                }
                if (i13 == 6578553) {
                    return f(m0Var, i11, "TDRC");
                }
                if (i13 == 4280916) {
                    return f(m0Var, i11, "TPE1");
                }
                if (i13 == 7630703) {
                    return f(m0Var, i11, "TSSE");
                }
                if (i13 == 6384738) {
                    return f(m0Var, i11, "TALB");
                }
                if (i13 == 7108978) {
                    return f(m0Var, i11, "USLT");
                }
                if (i13 == 6776174) {
                    return f(m0Var, i11, "TCON");
                }
                if (i13 == 6779504) {
                    return f(m0Var, i11, "TIT1");
                }
            } else {
                if (i11 == 1735291493) {
                    String strResolveV1Genre = yo.j.resolveV1Genre(d(m0Var) - 1);
                    if (strResolveV1Genre != null) {
                        kVar = new yo.n("TCON", (String) null, b5.of(strResolveV1Genre));
                    } else {
                        io.bidmachine.media3.common.util.b0.w("MetadataUtil", "Failed to parse standard genre code");
                    }
                    return kVar;
                }
                if (i11 == 1684632427) {
                    return c(m0Var, i11, "TPOS");
                }
                if (i11 == 1953655662) {
                    return c(m0Var, i11, "TRCK");
                }
                if (i11 == 1953329263) {
                    return e(i11, "TBPM", m0Var, true, false);
                }
                if (i11 == 1668311404) {
                    return e(i11, "TCMP", m0Var, true, true);
                }
                if (i11 == 1668249202) {
                    return b(m0Var);
                }
                if (i11 == 1631670868) {
                    return f(m0Var, i11, "TPE2");
                }
                if (i11 == 1936682605) {
                    return f(m0Var, i11, "TSOT");
                }
                if (i11 == 1936679276) {
                    return f(m0Var, i11, "TSOA");
                }
                if (i11 == 1936679282) {
                    return f(m0Var, i11, "TSOP");
                }
                if (i11 == 1936679265) {
                    return f(m0Var, i11, "TSO2");
                }
                if (i11 == 1936679791) {
                    return f(m0Var, i11, "TSOC");
                }
                if (i11 == 1920233063) {
                    return e(i11, "ITUNESADVISORY", m0Var, false, false);
                }
                if (i11 == 1885823344) {
                    return e(i11, "ITUNESGAPLESS", m0Var, false, true);
                }
                if (i11 == 1936683886) {
                    return f(m0Var, i11, "TVSHOWSORT");
                }
                if (i11 == 1953919848) {
                    return f(m0Var, i11, "TVSHOW");
                }
                if (i11 == 757935405) {
                    int i14 = -1;
                    int i15 = -1;
                    String nullTerminatedString = null;
                    String nullTerminatedString2 = null;
                    while (m0Var.getPosition() < i10) {
                        int position = m0Var.getPosition();
                        int i16 = m0Var.readInt();
                        int i17 = m0Var.readInt();
                        m0Var.skipBytes(4);
                        if (i17 == 1835360622) {
                            nullTerminatedString = m0Var.readNullTerminatedString(i16 - 12);
                        } else if (i17 == 1851878757) {
                            nullTerminatedString2 = m0Var.readNullTerminatedString(i16 - 12);
                        } else {
                            if (i17 == 1684108385) {
                                i14 = position;
                                i15 = i16;
                            }
                            m0Var.skipBytes(i16 - 12);
                        }
                    }
                    if (nullTerminatedString != null && nullTerminatedString2 != null && i14 != -1) {
                        m0Var.setPosition(i14);
                        m0Var.skipBytes(16);
                        kVar = new yo.k(nullTerminatedString, nullTerminatedString2, m0Var.readNullTerminatedString(i15 - 16));
                    }
                    return kVar;
                }
            }
            io.bidmachine.media3.common.util.b0.d("MetadataUtil", "Skipped unknown metadata entry: " + jn.e.getBoxTypeString(i11));
            return null;
        } finally {
            m0Var.setPosition(i10);
        }
    }

    public static jn.a parseMdtaMetadataEntryFromIlst(m0 m0Var, int i10, String str) {
        while (true) {
            int position = m0Var.getPosition();
            if (position >= i10) {
                return null;
            }
            int i11 = m0Var.readInt();
            if (m0Var.readInt() == 1684108385) {
                int i12 = m0Var.readInt();
                int i13 = m0Var.readInt();
                int i14 = i11 - 16;
                byte[] bArr = new byte[i14];
                m0Var.readBytes(bArr, 0, i14);
                return new jn.a(str, bArr, i13, i12);
            }
            m0Var.setPosition(position + i11);
        }
    }

    public static void setFormatGaplessInfo(int i10, n0 n0Var, gn.w wVar) {
        if (i10 == 1 && n0Var.hasGaplessInfo()) {
            wVar.setEncoderDelay(n0Var.f71710a).setEncoderPadding(n0Var.f71711b);
        }
    }

    public static void setFormatMetadata(int i10, u0 u0Var, gn.w wVar, u0 u0Var2, u0... u0VarArr) {
        if (u0Var2 == null) {
            u0Var2 = new u0(new t0[0]);
        }
        if (u0Var != null) {
            for (int i11 = 0; i11 < u0Var.length(); i11++) {
                t0 t0Var = u0Var.get(i11);
                if (t0Var instanceof jn.a) {
                    jn.a aVar = (jn.a) t0Var;
                    if (!aVar.f69709a.equals("com.android.capture.fps")) {
                        u0Var2 = u0Var2.copyWithAppendedEntries(aVar);
                    } else if (i10 == 2) {
                        u0Var2 = u0Var2.copyWithAppendedEntries(aVar);
                    }
                }
            }
        }
        for (u0 u0Var3 : u0VarArr) {
            u0Var2 = u0Var2.copyWithAppendedEntriesFrom(u0Var3);
        }
        if (u0Var2.length() > 0) {
            wVar.setMetadata(u0Var2);
        }
    }
}
