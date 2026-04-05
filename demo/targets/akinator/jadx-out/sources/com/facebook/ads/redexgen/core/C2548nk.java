package com.facebook.ads.redexgen.core;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Base64;
import com.applovin.shadow.okio.Utf8;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.vungle.ads.internal.protos.Sdk;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Deprecated
/* renamed from: com.facebook.ads.redexgen.X.nk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2548nk implements InterfaceC09484w {
    public final Context A00;
    public final InterfaceC09484w A01;
    public final C5H A02;

    public C2548nk(Context context, C5H c5h, InterfaceC09484w interfaceC09484w) {
        this.A00 = context.getApplicationContext();
        this.A02 = c5h;
        this.A01 = interfaceC09484w;
    }

    public C2548nk(Context context, String str, C5H c5h) {
        this(context, c5h, new C10529j().A01(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.9k] */
    @Override // com.facebook.ads.redexgen.core.InterfaceC09484w
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C10539k A5A() {
        final Context context = this.A00;
        final InterfaceC2549nl interfaceC2549nlA5A = this.A01.A5A();
        ?? r12 = new InterfaceC2549nl(context, interfaceC2549nlA5A) { // from class: com.facebook.ads.redexgen.X.9k
            public static byte[] A0B;
            public static String[] A0C = {"tGdrGbTKqUAyZjAtECCaXso437TIFtay", "xasvTmVCH4LeG7al8p8ObQF4UIpko", "linuVDi59rGKxPba8cSgrQfx0g5xcZS0", "EsZJycHVVsXuEv", "at8NLtJKkPgo1aJyGFOZsbSRJOLI96cu", "TOIRSmJtL8rNzzbss9LVqHyYWtEEJZpF", "R6ga9urJMlxgk01j3rMsq3yEpAD", "8pNo6y0"};
            public InterfaceC2549nl A00;
            public InterfaceC2549nl A01;
            public InterfaceC2549nl A02;
            public InterfaceC2549nl A03;
            public InterfaceC2549nl A04;
            public InterfaceC2549nl A05;
            public InterfaceC2549nl A06;

            @MetaExoPlayerCustomization("OculusDefaultDataSource accesses this field directly")
            public InterfaceC2549nl A07;
            public final InterfaceC2549nl A08;

            @MetaExoPlayerCustomization("OculusDefaultDataSource accesses this field directly")
            public final Context A09;

            @MetaExoPlayerCustomization("OculusDefaultDataSource accesses this field directly")
            public final List<C5H> A0A = new ArrayList();

            public static String A07(int i10, int i11, int i12) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
                for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                    bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 6);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A08() {
                A0B = new byte[]{24, 86, 89, 83, 69, 88, 94, 83, 104, 86, 68, 68, 82, 67, 24, 76, 121, 121, 104, 96, 125, 121, 100, 99, 106, 45, 121, 98, 45, 125, 97, 108, 116, 45, 95, 89, 64, 93, 45, 126, 121, AbstractJsonLexerKt.TC_INVALID, 104, 108, 96, 45, 122, 100, 121, 101, 98, 120, 121, 45, 105, 104, 125, 104, 99, 105, 100, 99, 106, 45, 98, 99, 45, 121, 101, 104, 45, 95, 89, 64, 93, 45, 104, 117, 121, 104, 99, 126, 100, 98, 99, 83, 114, 113, 118, 98, 123, 99, 83, 118, 99, 118, 68, 120, 98, 101, 116, 114, 7, 48, 48, 45, 48, 98, 43, 44, 49, 54, 35, 44, 54, 43, 35, 54, 43, 44, 37, 98, 16, 22, 15, 18, 98, 39, 58, 54, 39, 44, 49, 43, 45, 44, 70, 73, 67, 85, 72, 78, 67, 9, 85, 66, 84, 72, 82, 85, 68, 66, 48, 34, 34, 52, 37, 38, 42, 40, 107, 35, 36, 38, 32, 39, 42, 42, 46, 107, 36, 33, 54, 107, 34, 42, 42, 34, 41, 32, 107, 36, 43, 33, 55, 42, 44, 33, 107, 32, 61, 42, 53, 41, 36, 60, 32, 55, 119, 107, 32, 61, 49, 107, 55, 49, 40, 53, 107, 23, 49, 40, 53, 1, 36, 49, 36, 22, 42, 48, 55, 38, 32, 12, 0, 1, 27, 10, 1, 27, Utf8.REPLACEMENT_BYTE, 58, 47, 58, 51, 32, 54, 51, 36, 50, 46, 52, 51, 34, 36, 75, 77, 84, 73, 70, 87, 67};
            }

            static {
                A08();
            }

            {
                this.A09 = context.getApplicationContext();
                this.A08 = (InterfaceC2549nl) C3M.A01(interfaceC2549nlA5A);
            }

            private InterfaceC2549nl A00() {
                if (this.A00 == null) {
                    this.A00 = new AbstractC10549l(this.A09) { // from class: com.facebook.ads.redexgen.X.1B
                        public static byte[] A05;
                        public static String[] A06 = {"PTz87XAKzq7jvDXOa", "sgpUZ", "Bde9N92B9PLOW1wkk", "DRZuAIPcc", "gakZC5ePxUI2GDKV9", "pz9vQcEWFJbuREE6smExYo368tZlwkrG", "j43UPSzsV7IrH", "51Zh85ddLdY4jrUIDlK8L"};
                        public long A00;
                        public Uri A01;
                        public InputStream A02;
                        public boolean A03;
                        public final AssetManager A04;

                        public static String A00(int i10, int i11, int i12) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
                            for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                                int i14 = (bArrCopyOfRange[i13] ^ i12) ^ 113;
                                String[] strArr = A06;
                                if (strArr[2].length() != strArr[4].length()) {
                                    throw new RuntimeException();
                                }
                                A06[1] = "rCVU";
                                bArrCopyOfRange[i13] = (byte) i14;
                            }
                            return new String(bArrCopyOfRange);
                        }

                        public static void A01() {
                            A05 = new byte[]{124, 116, 58, 53, Utf8.REPLACEMENT_BYTE, 41, 52, 50, Utf8.REPLACEMENT_BYTE, 4, 58, 40, 40, 62, 47, 116};
                        }

                        /* JADX WARN: Failed to parse debug info
                        java.lang.ArrayIndexOutOfBoundsException
                         */
                        @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
                        public final long AFy(AnonymousClass56 anonymousClass56) throws C2551nn {
                            try {
                                this.A01 = anonymousClass56.A06;
                                String strSubstring = (String) C3M.A01(this.A01.getPath());
                                boolean zStartsWith = strSubstring.startsWith(A00(1, 15, 42));
                                String[] strArr = A06;
                                if (strArr[2].length() == strArr[4].length()) {
                                    String[] strArr2 = A06;
                                    strArr2[2] = "3xdRIl55zUe0UeQhp";
                                    strArr2[4] = "pS29hwepCfn47vExr";
                                    if (zStartsWith) {
                                        strSubstring = strSubstring.substring(15);
                                    } else if (strSubstring.startsWith(A00(0, 1, 34))) {
                                        strSubstring = strSubstring.substring(1);
                                    }
                                    A0G(anonymousClass56);
                                    this.A02 = this.A04.open(strSubstring, 1);
                                    if (this.A02.skip(anonymousClass56.A04) < anonymousClass56.A04) {
                                        throw new C2551nn(null, 2008);
                                    }
                                    if (anonymousClass56.A03 != -1) {
                                        this.A00 = anonymousClass56.A03;
                                    } else {
                                        this.A00 = this.A02.available();
                                        if (this.A00 == 2147483647L) {
                                            this.A00 = -1L;
                                        }
                                    }
                                    this.A03 = true;
                                    A0H(anonymousClass56);
                                    return this.A00;
                                }
                            } catch (C2551nn e10) {
                                throw e10;
                            } catch (IOException e11) {
                                boolean z10 = e11 instanceof FileNotFoundException;
                                if (A06[6].length() == 13) {
                                    A06[6] = "P3wDYI6sXfUMf";
                                    throw new C2551nn(e11, z10 ? 2005 : 2000);
                                }
                            }
                            throw new RuntimeException();
                        }

                        static {
                            A01();
                        }

                        {
                            super(false);
                            this.A04 = context.getAssets();
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
                        public final Uri A9H() {
                            return this.A01;
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
                        public final void close() throws C2551nn {
                            this.A01 = null;
                            try {
                                try {
                                    if (this.A02 != null) {
                                        this.A02.close();
                                    }
                                } catch (IOException e10) {
                                    throw new C2551nn(e10, 2000);
                                }
                            } finally {
                                this.A02 = null;
                                if (this.A03) {
                                    this.A03 = false;
                                    A0E();
                                }
                            }
                        }

                        @Override // com.facebook.ads.redexgen.core.AnonymousClass20
                        public final int read(byte[] bArr, int i10, int i11) throws IOException {
                            if (i11 == 0) {
                                return 0;
                            }
                            if (this.A00 == 0) {
                                return -1;
                            }
                            try {
                                if (this.A00 != -1) {
                                    i11 = (int) Math.min(this.A00, i11);
                                }
                                int i12 = ((InputStream) AbstractC09264a.A0f(this.A02)).read(bArr, i10, i11);
                                if (i12 == -1) {
                                    return -1;
                                }
                                long j10 = this.A00;
                                if (A06[6].length() != 13) {
                                    throw new RuntimeException();
                                }
                                A06[6] = "7Z6S4bUZVA19c";
                                if (j10 != -1) {
                                    this.A00 -= i12;
                                }
                                A0F(i12);
                                return i12;
                            } catch (IOException e10) {
                                throw new C2551nn(e10, 2000);
                            }
                        }
                    };
                    A09(this.A00);
                }
                return this.A00;
            }

            private InterfaceC2549nl A01() {
                if (this.A01 == null) {
                    this.A01 = new AbstractC10549l(this.A09) { // from class: com.facebook.ads.redexgen.X.1A
                        public static byte[] A06;
                        public static String[] A07 = {"2ftN4rqyMzReasXlS0Bd7yvXq4Z2w8Rd", "SB3v1XRSpovCjfjTdx7anKa7xqXJKcRT", "XVjCn6r7eDTGJtLvngTS2wgt8nCOhnB8", "1Z3zzaFrxDlwod4BzGavHrSG6vNvtkR5", "UgcL11Y1AQOJlkVRTNTymNMOAMwNhJW2", "NkTGPgJcqOjwrAzhjPkYXMY7OTNaeVTG", "UuxCrg9I54LtW8vlxqROWB7HyIfBI135", "4rxicH75x32fMwhdD1obBcUBdLwTm4oP"};
                        public long A00;
                        public AssetFileDescriptor A01;
                        public Uri A02;
                        public FileInputStream A03;
                        public boolean A04;
                        public final ContentResolver A05;

                        public static String A00(int i10, int i11, int i12) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
                            for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                                bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 87);
                            }
                            return new String(bArrCopyOfRange);
                        }

                        public static void A01() {
                            A06 = new byte[]{-76, -71, -76, 10, 54, 60, 51, 43, -25, 53, 54, 59, -25, 54, 55, 44, 53, -25, 45, 48, 51, 44, -25, 43, 44, 58, 42, 57, 48, 55, 59, 54, 57, -25, 45, 54, 57, 1, -25, 12, 25, 15, 29, 26, 20, 15, -39, 27, 29, 26, 33, 20, 15, 16, 29, -39, 16, 35, 31, 29, 12, -39, -20, -18, -18, -16, -5, -1, 10, -6, -3, -12, -14, -12, -7, -20, -9, 10, -8, -16, -17, -12, -20, 10, -15, -6, -3, -8, -20, -1, -70, -58, -59, -53, -68, -59, -53, 1};
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:30:0x00e4, code lost:
                        
                            if (r0 >= 0) goto L39;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:33:0x00ee, code lost:
                        
                            if (r0 >= 0) goto L39;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:38:0x010e, code lost:
                        
                            if (r0 >= 0) goto L39;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:43:0x012a, code lost:
                        
                            if (r0 >= 0) goto L39;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:58:0x016d, code lost:
                        
                            throw new com.facebook.ads.redexgen.core.C2550nm(null, 2008);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:60:0x0176, code lost:
                        
                            throw new com.facebook.ads.redexgen.core.C2550nm(null, 2008);
                         */
                        /* JADX WARN: Failed to parse debug info
                        java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 15
                        	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
                        	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
                        	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
                        	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
                        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
                         */
                        @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final long AFy(com.facebook.ads.redexgen.core.AnonymousClass56 r14) throws java.io.IOException {
                            /*
                                Method dump skipped, instructions count: 449
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1A.AFy(com.facebook.ads.redexgen.X.56):long");
                        }

                        static {
                            A01();
                        }

                        {
                            super(false);
                            this.A05 = context.getContentResolver();
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
                        public final Uri A9H() {
                            return this.A02;
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
                        public final void close() throws C2550nm {
                            this.A02 = null;
                            try {
                                try {
                                    if (this.A03 != null) {
                                        this.A03.close();
                                    }
                                    this.A03 = null;
                                    try {
                                        try {
                                            if (this.A01 != null) {
                                                this.A01.close();
                                            }
                                        } catch (IOException e10) {
                                            throw new C2550nm(e10, 2000);
                                        }
                                    } finally {
                                        this.A01 = null;
                                        if (this.A04) {
                                            this.A04 = false;
                                            A0E();
                                        }
                                    }
                                } catch (IOException e11) {
                                    throw new C2550nm(e11, 2000);
                                }
                            } catch (Throwable th2) {
                                this.A03 = null;
                                try {
                                    try {
                                        if (this.A01 != null) {
                                            this.A01.close();
                                        }
                                        this.A01 = null;
                                        if (this.A04) {
                                            this.A04 = false;
                                            A0E();
                                        }
                                        throw th2;
                                    } catch (IOException e12) {
                                        throw new C2550nm(e12, 2000);
                                    }
                                } finally {
                                    this.A01 = null;
                                    if (this.A04) {
                                        this.A04 = false;
                                        A0E();
                                    }
                                }
                            }
                        }

                        @Override // com.facebook.ads.redexgen.core.AnonymousClass20
                        public final int read(byte[] bArr, int i10, int i11) throws IOException {
                            if (i11 == 0) {
                                return 0;
                            }
                            long j10 = this.A00;
                            if (A07[1].charAt(15) != 'T') {
                                throw new RuntimeException();
                            }
                            String[] strArr = A07;
                            strArr[0] = "xrRDl1n0HP8M9562uVsbLDb97IGJJORF";
                            strArr[3] = "BxGqKYmJPgWUa88HGr5IfMWzChfrhfRY";
                            if (j10 == 0) {
                                return -1;
                            }
                            try {
                                if (this.A00 != -1) {
                                    i11 = (int) Math.min(this.A00, i11);
                                }
                                int i12 = ((FileInputStream) AbstractC09264a.A0f(this.A03)).read(bArr, i10, i11);
                                if (i12 == -1) {
                                    return -1;
                                }
                                if (this.A00 != -1) {
                                    this.A00 -= i12;
                                }
                                A0F(i12);
                                return i12;
                            } catch (IOException e10) {
                                throw new C2550nm(e10, 2000);
                            }
                        }
                    };
                    A09(this.A01);
                }
                return this.A01;
            }

            private InterfaceC2549nl A02() {
                if (this.A02 == null) {
                    this.A02 = new AbstractC10549l() { // from class: com.facebook.ads.redexgen.X.19
                        public static byte[] A04;
                        public int A00;
                        public int A01;
                        public AnonymousClass56 A02;
                        public byte[] A03;

                        static {
                            A01();
                        }

                        public static String A00(int i10, int i11, int i12) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
                            for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                                bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 120);
                            }
                            return new String(bArrCopyOfRange);
                        }

                        public static void A01() {
                            A04 = new byte[]{-17, 48, 87, 86, 104, 90, 43, 41, 58, 103, 103, 100, 103, 21, 108, 93, 94, 97, 90, 21, 101, 86, 103, 104, 94, 99, 92, 21, 55, 86, 104, 90, 43, 41, 21, 90, 99, 88, 100, 89, 90, 89, 21, 104, 105, 103, 94, 99, 92, 47, 21, -23, 2, -7, 12, 4, -7, -9, 8, -7, -8, -76, -23, -26, -35, -76, -6, 3, 6, 1, -11, 8, -50, -76, 60, 85, 90, 92, 87, 87, 86, 89, 91, 76, 75, 7, 90, 74, 79, 76, 84, 76, 33, 7, 25, 22, 41, 22};
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
                        public final Uri A9H() {
                            if (this.A02 != null) {
                                return this.A02.A06;
                            }
                            return null;
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
                        public final long AFy(AnonymousClass56 anonymousClass56) throws IOException {
                            A0G(anonymousClass56);
                            this.A02 = anonymousClass56;
                            Uri uri = anonymousClass56.A06;
                            String scheme = uri.getScheme();
                            C3M.A09(A00(94, 4, 61).equals(scheme), A00(74, 20, 111) + scheme);
                            String[] uriParts = AbstractC09264a.A1O(uri.getSchemeSpecificPart(), A00(0, 1, 75));
                            if (uriParts.length == 2) {
                                String str = uriParts[1];
                                String dataString = uriParts[0];
                                if (dataString.contains(A00(1, 7, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE))) {
                                    try {
                                        this.A03 = Base64.decode(str, 0);
                                    } catch (IllegalArgumentException e10) {
                                        throw C08822i.A02(A00(8, 43, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) + str, e10);
                                    }
                                } else {
                                    this.A03 = AbstractC09264a.A1G(URLDecoder.decode(str, AbstractC2246ia.A02.name()));
                                }
                                if (anonymousClass56.A04 <= this.A03.length) {
                                    this.A01 = (int) anonymousClass56.A04;
                                    this.A00 = this.A03.length - this.A01;
                                    if (anonymousClass56.A03 != -1) {
                                        this.A00 = (int) Math.min(this.A00, anonymousClass56.A03);
                                    }
                                    A0H(anonymousClass56);
                                    return anonymousClass56.A03 != -1 ? anonymousClass56.A03 : this.A00;
                                }
                                this.A03 = null;
                                throw new C09514z(2008);
                            }
                            throw C08822i.A02(A00(51, 23, 28) + uri, null);
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
                        public final void close() {
                            if (this.A03 != null) {
                                this.A03 = null;
                                A0E();
                            }
                            this.A02 = null;
                        }

                        @Override // com.facebook.ads.redexgen.core.AnonymousClass20
                        public final int read(byte[] bArr, int i10, int i11) {
                            if (i11 == 0) {
                                return 0;
                            }
                            if (this.A00 == 0) {
                                return -1;
                            }
                            int iMin = Math.min(i11, this.A00);
                            System.arraycopy(AbstractC09264a.A0f(this.A03), this.A01, bArr, i10, iMin);
                            this.A01 += iMin;
                            this.A00 -= iMin;
                            A0F(iMin);
                            return iMin;
                        }
                    };
                    A09(this.A02);
                }
                return this.A02;
            }

            private InterfaceC2549nl A03() {
                if (this.A03 == null) {
                    this.A03 = new AnonymousClass17();
                    A09(this.A03);
                }
                return this.A03;
            }

            private InterfaceC2549nl A04() {
                if (this.A04 == null) {
                    this.A04 = new AbstractC10549l(this.A09) { // from class: com.facebook.ads.redexgen.X.16
                        public static byte[] A07;
                        public static String[] A08 = {"QLuP8Pt4KiB", "RgtlFkBshe2uzsEMObMvf6GLE9oju0kX", "TTP1lITjIL7gpSd4kE", "ZIRCIqgztw3RRTH34yg2MmGGdHBG3Sqw", "W8lxrl5W", "1BP9Supp2XIZ7aBeV", "CPoLKetsO3XScG5XHhoA5", "r"};
                        public long A00;
                        public AssetFileDescriptor A01;
                        public Uri A02;
                        public InputStream A03;
                        public boolean A04;
                        public final Resources A05;
                        public final String A06;

                        public static String A00(int i10, int i11, int i12) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
                            for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                                bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 127);
                            }
                            return new String(bArrCopyOfRange);
                        }

                        public static void A01() {
                            A07 = new byte[]{105, 54, 72, 99, 105, 45, 98, 107, 45, 126, 121, AbstractJsonLexerKt.TC_INVALID, 104, 108, 96, 45, AbstractJsonLexerKt.TC_INVALID, 104, 108, 110, 101, 104, 105, 45, 101, 108, 123, 100, 99, 106, 45, 99, 98, 121, 45, AbstractJsonLexerKt.TC_INVALID, 104, 108, 105, 45, 126, 120, 107, 107, 100, 110, 100, 104, 99, 121, 45, 105, 108, 121, 108, 35, 122, 77, 91, 71, 93, 90, 75, 77, 8, 65, 76, 77, 70, 92, 65, 78, 65, 77, 90, 8, 69, 93, 91, 92, 8, 74, 77, 8, 73, 70, 8, 65, 70, 92, 77, 79, 77, 90, 6, 27, 44, 58, 38, 60, 59, 42, 44, 105, 32, 58, 105, 42, 38, 36, 57, 59, 44, 58, 58, 44, 45, 115, 105, 50, 5, 19, 15, 21, 18, 3, 5, 64, 14, 15, 20, 64, 6, 15, 21, 14, 4, 78, 115, 116, 111, 6, 75, 83, 85, 82, 6, 67, 79, 82, 78, 67, 84, 6, 83, 85, 67, 6, 85, 69, 78, 67, 75, 67, 6, 84, 71, 81, 84, 67, 85, 73, 83, 84, 69, 67, 6, 73, 84, 6, 71, 72, 66, 84, 73, 79, 66, 8, 84, 67, 85, 73, 83, 84, 69, 67, 114, 74, 5, 98, 109, 103, 113, 108, 106, 103, 45, 113, 102, 112, 108, 118, 113, 96, 102, 69, 86, 64, 92, 79, 89, 92, 75, 93, 65, 91, 92, 77, 75};
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:100:0x0260, code lost:
                        
                            throw new com.facebook.ads.redexgen.core.C2538na(A00(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 19, 31), null, 2005);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:24:0x00f7, code lost:
                        
                            if (r1 != 0) goto L25;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:27:0x0116, code lost:
                        
                            if (r1 != 0) goto L25;
                         */
                        /* JADX WARN: Failed to parse debug info
                        java.lang.ArrayIndexOutOfBoundsException
                         */
                        /* JADX WARN: Removed duplicated region for block: B:107:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final long AFy(com.facebook.ads.redexgen.core.AnonymousClass56 r14) throws android.content.res.Resources.NotFoundException, com.facebook.ads.redexgen.core.C09514z, java.lang.NumberFormatException {
                            /*
                                Method dump skipped, instructions count: 641
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AnonymousClass16.AFy(com.facebook.ads.redexgen.X.56):long");
                        }

                        static {
                            A01();
                        }

                        {
                            super(false);
                            this.A05 = context.getResources();
                            this.A06 = context.getPackageName();
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
                        public final Uri A9H() {
                            return this.A02;
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
                        public final void close() throws C2538na {
                            this.A02 = null;
                            try {
                                try {
                                    if (this.A03 != null) {
                                        this.A03.close();
                                    }
                                    this.A03 = null;
                                    try {
                                        try {
                                            if (this.A01 != null) {
                                                this.A01.close();
                                            }
                                        } catch (IOException e10) {
                                            throw new C2538na(null, e10, 2000);
                                        }
                                    } catch (Throwable th2) {
                                        this.A01 = null;
                                        String[] strArr = A08;
                                        if (strArr[1].charAt(14) == strArr[3].charAt(14)) {
                                            throw new RuntimeException();
                                        }
                                        A08[6] = "iC26zNxzLLnB2GH7qyOIGlAQhGgRPuU";
                                        if (this.A04) {
                                            this.A04 = false;
                                            A0E();
                                        }
                                        throw th2;
                                    }
                                } catch (IOException e11) {
                                    throw new C2538na(null, e11, 2000);
                                }
                            } catch (Throwable th3) {
                                this.A03 = null;
                                try {
                                    try {
                                        if (this.A01 != null) {
                                            this.A01.close();
                                        }
                                        this.A01 = null;
                                        if (this.A04) {
                                            this.A04 = false;
                                            A0E();
                                        }
                                        throw th3;
                                    } catch (IOException e12) {
                                        throw new C2538na(null, e12, 2000);
                                    }
                                } finally {
                                    this.A01 = null;
                                    if (this.A04) {
                                        this.A04 = false;
                                        A0E();
                                    }
                                }
                            }
                        }

                        @Override // com.facebook.ads.redexgen.core.AnonymousClass20
                        public final int read(byte[] bArr, int i10, int i11) throws IOException {
                            if (i11 == 0) {
                                return 0;
                            }
                            if (this.A00 == 0) {
                                return -1;
                            }
                            try {
                                if (this.A00 != -1) {
                                    i11 = (int) Math.min(this.A00, i11);
                                }
                                int i12 = ((InputStream) AbstractC09264a.A0f(this.A03)).read(bArr, i10, i11);
                                if (i12 == -1) {
                                    if (this.A00 == -1) {
                                        return -1;
                                    }
                                    throw new C2538na(A00(2, 54, 114), new EOFException(), 2000);
                                }
                                if (this.A00 != -1) {
                                    this.A00 -= i12;
                                }
                                A0F(i12);
                                return i12;
                            } catch (IOException e10) {
                                throw new C2538na(null, e10, 2000);
                            }
                        }
                    };
                    A09(this.A04);
                }
                return this.A04;
            }

            private InterfaceC2549nl A05() throws Exception {
                if (this.A05 == null) {
                    try {
                        this.A05 = (InterfaceC2549nl) Class.forName(A07(157, 66, 67)).getConstructor(new Class[0]).newInstance(new Object[0]);
                        A09(this.A05);
                    } catch (ClassNotFoundException unused) {
                        AnonymousClass44.A07(A07(85, 17, 17), A07(15, 70, 11));
                    } catch (Exception e10) {
                        throw new RuntimeException(A07(102, 34, 68), e10);
                    }
                    if (this.A05 == null) {
                        this.A05 = this.A08;
                    }
                }
                return this.A05;
            }

            private InterfaceC2549nl A06() {
                if (this.A06 == null) {
                    this.A06 = new AnonymousClass15();
                    A09(this.A06);
                }
                return this.A06;
            }

            /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private void A09(com.facebook.ads.redexgen.core.InterfaceC2549nl r3) {
                /*
                    r2 = this;
                    r1 = 0
                L1:
                    java.util.List<com.facebook.ads.redexgen.X.5H> r0 = r2.A0A
                    int r0 = r0.size()
                    if (r1 >= r0) goto L17
                    java.util.List<com.facebook.ads.redexgen.X.5H> r0 = r2.A0A
                    java.lang.Object r0 = r0.get(r1)
                    com.facebook.ads.redexgen.X.5H r0 = (com.facebook.ads.redexgen.core.C5H) r0
                    r3.A3v(r0)
                    int r1 = r1 + 1
                    goto L1
                L17:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C10539k.A09(com.facebook.ads.redexgen.X.nl):void");
            }

            private void A0A(InterfaceC2549nl interfaceC2549nl, C5H c5h) {
                if (interfaceC2549nl != null) {
                    interfaceC2549nl.A3v(c5h);
                }
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
            public final void A3v(C5H c5h) {
                C3M.A01(c5h);
                this.A08.A3v(c5h);
                this.A0A.add(c5h);
                A0A(this.A03, c5h);
                A0A(this.A00, c5h);
                A0A(this.A01, c5h);
                A0A(this.A05, c5h);
                A0A(this.A06, c5h);
                A0A(this.A02, c5h);
                A0A(this.A04, c5h);
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
            public final Map<String, List<String>> A8l() {
                return this.A07 == null ? Collections.emptyMap() : this.A07.A8l();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
            public final Uri A9H() {
                if (this.A07 == null) {
                    return null;
                }
                return this.A07.A9H();
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x012e  */
            @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final long AFy(com.facebook.ads.redexgen.core.AnonymousClass56 r8) throws java.io.IOException {
                /*
                    Method dump skipped, instructions count: 309
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C10539k.AFy(com.facebook.ads.redexgen.X.56):long");
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
            public final void close() throws IOException {
                if (this.A07 != null) {
                    try {
                        this.A07.close();
                    } finally {
                        this.A07 = null;
                    }
                }
            }

            @Override // com.facebook.ads.redexgen.core.AnonymousClass20
            public final int read(byte[] bArr, int i10, int i11) throws IOException {
                return ((InterfaceC2549nl) C3M.A01(this.A07)).read(bArr, i10, i11);
            }
        };
        if (this.A02 != null) {
            r12.A3v(this.A02);
        }
        return r12;
    }
}
