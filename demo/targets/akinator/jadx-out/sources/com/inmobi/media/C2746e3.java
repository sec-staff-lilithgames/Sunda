package com.inmobi.media;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import xv.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.e3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2746e3 {

    /* renamed from: a, reason: collision with root package name */
    public final xv.l0 f32798a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32799b;

    public C2746e3(xv.i0[] i0VarArr, xv.x dispatcher, Ge timeoutConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dispatcher, "dispatcher");
        kotlin.jvm.internal.e0.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        this.f32799b = timeoutConfig.f31830c;
        l0.a aVar = new l0.a();
        if (i0VarArr != null) {
            for (xv.i0 i0Var : i0VarArr) {
                aVar.addInterceptor(i0Var);
            }
        }
        aVar.addInterceptor(new Tc());
        aVar.addNetworkInterceptor(new C3037v7());
        aVar.protocols(uu.p0.mutableListOf(xv.n0.f93762h, xv.n0.f93760f));
        aVar.retryOnConnectionFailure(false);
        aVar.dispatcher(dispatcher);
        long j10 = timeoutConfig.f31828a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.connectTimeout(j10, timeUnit);
        aVar.readTimeout(timeoutConfig.f31829b, timeUnit);
        aVar.callTimeout(timeoutConfig.f31830c, timeUnit);
        xv.l0 l0VarBuild = aVar.build();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(l0VarBuild, "build(...)");
        this.f32798a = l0VarBuild;
    }

    public final Y9 a(xv.l0 l0Var, xv.o0 o0Var, String str) throws Throwable {
        xv.v0 v0Var;
        pw.l lVarOf;
        Y9 c3034v4;
        xv.j0 j0VarContentType;
        xv.v0 v0Var2 = null;
        string = null;
        String string = null;
        v0Var = null;
        v0Var = null;
        v0Var = null;
        v0Var = null;
        v0Var2 = null;
        xv.v0 v0Var3 = null;
        xv.v0 v0Var4 = null;
        xv.v0 v0Var5 = null;
        xv.v0 v0Var6 = null;
        try {
            try {
                ExecutorService executorService = l0Var.dispatcher().executorService();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(executorService, "executorService(...)");
                try {
                    v0Var = (xv.v0) AbstractC2792gf.a(executorService, this.f32799b, TimeUnit.SECONDS, new com.google.firebase.messaging.m(16, l0Var, o0Var));
                } catch (MalformedURLException unused) {
                } catch (SocketTimeoutException unused2) {
                } catch (IOException unused3) {
                } catch (CancellationException e10) {
                    throw e10;
                } catch (Exception unused4) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (MalformedURLException unused5) {
        } catch (SocketTimeoutException unused6) {
        } catch (IOException unused7) {
        } catch (CancellationException e11) {
            throw e11;
        } catch (Exception unused8) {
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            int iCode = v0Var.code();
            xv.w0 w0VarBody = v0Var.body();
            if (w0VarBody != null) {
                byte[] bArrBytes = w0VarBody.bytes();
                lVarOf = pw.l.of(Arrays.copyOf(bArrBytes, bArrBytes.length));
                if (lVarOf == null) {
                    lVarOf = pw.l.f81912g;
                }
            } else {
                lVarOf = pw.l.f81912g;
            }
            Map<String, List<String>> multimap = v0Var.headers().toMultimap();
            xv.w0 w0VarBody2 = v0Var.body();
            long jContentLength = w0VarBody2 != null ? w0VarBody2.contentLength() : 0L;
            xv.w0 w0VarBody3 = v0Var.body();
            if (w0VarBody3 != null && (j0VarContentType = w0VarBody3.contentType()) != null) {
                string = j0VarContentType.toString();
            }
            long jReceivedResponseAtMillis = v0Var.receivedResponseAtMillis() - v0Var.sentRequestAtMillis();
            long j10 = 0;
            if (jReceivedResponseAtMillis >= 0) {
                j10 = jReceivedResponseAtMillis;
            }
            kotlin.jvm.internal.e0.checkNotNull(multimap);
            U9 u92 = new U9(j10, multimap, (int) jContentLength, string);
            if (AbstractC2792gf.a(v0Var)) {
                kotlin.jvm.internal.e0.checkNotNull(lVarOf);
                c3034v4 = new C2685aa(str, iCode, lVarOf, u92);
            } else {
                EnumC2983s4.f33355b.getClass();
                c3034v4 = new C3034v4(str, C2950q4.a(iCode));
            }
            v0Var.close();
            return c3034v4;
        } catch (MalformedURLException unused9) {
            v0Var3 = v0Var;
            C3034v4 c3034v42 = new C3034v4(str, EnumC2983s4.f33361h);
            if (v0Var3 != null) {
                v0Var3.close();
            }
            return c3034v42;
        } catch (SocketTimeoutException unused10) {
            v0Var4 = v0Var;
            C3034v4 c3034v43 = new C3034v4(str, EnumC2983s4.f33362i);
            if (v0Var4 != null) {
                v0Var4.close();
            }
            return c3034v43;
        } catch (IOException unused11) {
            v0Var5 = v0Var;
            C3034v4 c3034v44 = new C3034v4(str, EnumC2983s4.f33358e);
            if (v0Var5 != null) {
                v0Var5.close();
            }
            return c3034v44;
        } catch (CancellationException e12) {
            throw e12;
        } catch (Exception unused12) {
            v0Var6 = v0Var;
            C3034v4 c3034v45 = new C3034v4(str, EnumC2983s4.f33357d);
            if (v0Var6 != null) {
                v0Var6.close();
            }
            return c3034v45;
        } catch (Throwable th4) {
            th = th4;
            v0Var2 = v0Var;
            if (v0Var2 != null) {
                v0Var2.close();
            }
            throw th;
        }
    }

    public static final xv.v0 a(xv.l0 client, xv.o0 okHttpRequest) {
        kotlin.jvm.internal.e0.checkNotNullParameter(client, "$client");
        kotlin.jvm.internal.e0.checkNotNullParameter(okHttpRequest, "$okHttpRequest");
        return client.newCall(okHttpRequest).execute();
    }
}
