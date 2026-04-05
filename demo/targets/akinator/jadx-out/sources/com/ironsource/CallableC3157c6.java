package com.ironsource;

import android.text.TextUtils;
import com.applovin.shadow.okio.Segment;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.c6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class CallableC3157c6 implements Callable<C3246h5> {

    /* renamed from: d, reason: collision with root package name */
    private static final String f36122d = "FileWorkerThread";

    /* renamed from: e, reason: collision with root package name */
    private static final String f36123e = "X-Android-Protocols";

    /* renamed from: f, reason: collision with root package name */
    private static final String f36124f = "http/1.1,h2";

    /* renamed from: a, reason: collision with root package name */
    private final C3228g5 f36125a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36126b;

    /* renamed from: c, reason: collision with root package name */
    private long f36127c;

    public CallableC3157c6(C3228g5 c3228g5, String str, long j10) {
        this.f36125a = c3228g5;
        this.f36126b = str;
        this.f36127c = j10;
    }

    public int a(byte[] bArr, String str) throws Exception {
        return IronSourceStorageUtils.saveFile(bArr, str);
    }

    public boolean a(String str, String str2) throws Exception {
        return IronSourceStorageUtils.renameFile(str, str2);
    }

    public byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Segment.SIZE];
        while (true) {
            int i10 = inputStream.read(bArr, 0, Segment.SIZE);
            if (i10 != -1) {
                byteArrayOutputStream.write(bArr, 0, i10);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3246h5 call() throws Throwable {
        CallableC3157c6 callableC3157c6;
        if (this.f36127c == 0) {
            this.f36127c = 1L;
        }
        C3246h5 c3246h5A = null;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f36127c) {
                callableC3157c6 = this;
                break;
            }
            callableC3157c6 = this;
            c3246h5A = callableC3157c6.a(this.f36125a.e(), i10, this.f36125a.a(), this.f36125a.c(), this.f36125a.f());
            int iB = c3246h5A.b();
            if (iB != 1008 && iB != 1009) {
                break;
            }
            i10++;
        }
        C3246h5 c3246h5 = c3246h5A;
        if (c3246h5 != null && c3246h5.a() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(callableC3157c6.f36126b);
            String str = File.separator;
            sb2.append(str);
            sb2.append(callableC3157c6.f36125a.b().getName());
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            w0.i.h(sb3, callableC3157c6.f36125a.d(), str, C3227g4.E);
            sb3.append(callableC3157c6.f36125a.b().getName());
            String string2 = sb3.toString();
            try {
                if (a(c3246h5.a(), string2) == 0) {
                    c3246h5.a(1006);
                    return c3246h5;
                }
                if (!a(string2, string)) {
                    c3246h5.a(C3227g4.f36756j);
                    return c3246h5;
                }
            } catch (FileNotFoundException e10) {
                C3422r4.d().a(e10);
                c3246h5.a(1018);
            } catch (Error e11) {
                C3422r4.d().a(e11);
                if (!TextUtils.isEmpty(e11.getMessage())) {
                    Logger.i(f36122d, e11.getMessage());
                }
                c3246h5.a(1019);
            } catch (Exception e12) {
                C3422r4.d().a(e12);
                if (!TextUtils.isEmpty(e12.getMessage())) {
                    Logger.i(f36122d, e12.getMessage());
                }
                c3246h5.a(1009);
            }
        }
        return c3246h5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0193 A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #6 {all -> 0x018f, blocks: (B:109:0x018b, B:113:0x0193), top: B:118:0x018b }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ironsource.C3246h5 a(java.lang.String r8, int r9, int r10, int r11, boolean r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.CallableC3157c6.a(java.lang.String, int, int, int, boolean):com.ironsource.h5");
    }
}
