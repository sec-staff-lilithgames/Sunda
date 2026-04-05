package xr;

import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import androidx.core.app.NotificationCompat;
import com.apm.insight.b.El.rJqlArycrfkilN;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import wr.b3;
import wr.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class c5 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f92306a = Logger.getLogger(c5.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Set f92307b = Collections.unmodifiableSet(EnumSet.of(wr.j6.OK, wr.j6.INVALID_ARGUMENT, wr.j6.NOT_FOUND, wr.j6.ALREADY_EXISTS, wr.j6.FAILED_PRECONDITION, wr.j6.ABORTED, wr.j6.OUT_OF_RANGE, wr.j6.DATA_LOSS));

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f92308c = Charset.forName(C.ASCII_NAME);

    /* renamed from: d, reason: collision with root package name */
    public static final wr.z3 f92309d = wr.z3.of("grpc-timeout", new b5());

    /* renamed from: e, reason: collision with root package name */
    public static final wr.z3 f92310e;

    /* renamed from: f, reason: collision with root package name */
    public static final wr.z3 f92311f;

    /* renamed from: g, reason: collision with root package name */
    public static final wr.z3 f92312g;

    /* renamed from: h, reason: collision with root package name */
    public static final wr.z3 f92313h;

    /* renamed from: i, reason: collision with root package name */
    public static final wr.z3 f92314i;

    /* renamed from: j, reason: collision with root package name */
    public static final wr.z3 f92315j;

    /* renamed from: k, reason: collision with root package name */
    public static final wr.z3 f92316k;

    /* renamed from: l, reason: collision with root package name */
    public static final wr.z3 f92317l;

    /* renamed from: m, reason: collision with root package name */
    public static final mh.r2 f92318m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f92319n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f92320o;

    /* renamed from: p, reason: collision with root package name */
    public static final long f92321p;

    /* renamed from: q, reason: collision with root package name */
    public static final za f92322q;

    /* renamed from: r, reason: collision with root package name */
    public static final wr.h f92323r;

    /* renamed from: s, reason: collision with root package name */
    public static final t4 f92324s;

    /* renamed from: t, reason: collision with root package name */
    public static final u4 f92325t;

    /* renamed from: u, reason: collision with root package name */
    public static final v4 f92326u;

    /* renamed from: v, reason: collision with root package name */
    public static final w4 f92327v;

    public static o1 a(wr.c3 c3Var, boolean z10) {
        b3.e subchannel = c3Var.getSubchannel();
        o1 o1VarObtainActiveTransport = subchannel != null ? ((i6) ((ef) subchannel.getInternalSubchannel())).obtainActiveTransport() : null;
        if (o1VarObtainActiveTransport != null) {
            u.a streamTracerFactory = c3Var.getStreamTracerFactory();
            return streamTracerFactory == null ? o1VarObtainActiveTransport : new x4(streamTracerFactory, o1VarObtainActiveTransport);
        }
        if (!c3Var.getStatus().isOk()) {
            if (c3Var.isDrop()) {
                return new i4(replaceInappropriateControlPlaneStatus(c3Var.getStatus()), l1.f92750e);
            }
            if (!z10) {
                return new i4(replaceInappropriateControlPlaneStatus(c3Var.getStatus()), l1.f92748b);
            }
        }
        return null;
    }

    public static URI authorityToUri(String str) {
        String str2;
        mh.p1.checkNotNull(str, "authority");
        try {
            str2 = str;
            try {
                return new URI(null, str2, null, null, null);
            } catch (URISyntaxException e10) {
                e = e10;
                throw new IllegalArgumentException(a.b.k("Invalid authority: ", str2), e);
            }
        } catch (URISyntaxException e11) {
            e = e11;
            str2 = str;
        }
    }

    public static String checkAuthority(String str) {
        mh.p1.checkArgument(authorityToUri(str).getAuthority().indexOf(64) == -1, "Userinfo must not be present on authority: '%s'", str);
        return str;
    }

    public static void closeQuietly(Closeable closeable) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e10) {
            f92306a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e10);
        }
    }

    public static void exhaust(InputStream inputStream) throws IOException {
        while (inputStream.read(new byte[NotificationCompat.FLAG_LOCAL_ONLY]) != -1) {
        }
    }

    public static wr.u[] getClientStreamTracers(wr.i iVar, wr.e4 e4Var, int i10, boolean z10) {
        List<u.a> streamTracerFactories = iVar.getStreamTracerFactories();
        int size = streamTracerFactories.size();
        wr.u[] uVarArr = new wr.u[size + 1];
        wr.w wVarBuild = wr.w.newBuilder().setCallOptions(iVar).setPreviousAttempts(i10).setIsTransparentRetry(z10).build();
        for (int i11 = 0; i11 < streamTracerFactories.size(); i11++) {
            uVarArr[i11] = streamTracerFactories.get(i11).newClientStreamTracer(wVarBuild, e4Var);
        }
        uVarArr[size] = f92324s;
        return uVarArr;
    }

    public static boolean getFlag(String str, boolean z10) {
        String property = System.getenv(str);
        if (property == null) {
            property = System.getProperty(str);
        }
        return z10 ? mh.u2.isNullOrEmpty(property) || Boolean.parseBoolean(property) : !mh.u2.isNullOrEmpty(property) && Boolean.parseBoolean(property);
    }

    public static z4 getGrpcBuildVersion() {
        return new z4();
    }

    public static String getGrpcUserAgent(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str2 != null) {
            sb2.append(str2);
            sb2.append(' ');
        }
        return a.b.o(sb2, "grpc-java-", str, "/1.62.2");
    }

    public static String getHost(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", null).invoke(inetSocketAddress, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static ThreadFactory getThreadFactory(String str, boolean z10) {
        return new sh.c2().setDaemon(z10).setNameFormat(str).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static wr.m6 httpStatusToGrpcStatus(int r3) {
        /*
            r0 = 100
            if (r3 < r0) goto Lb
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 >= r0) goto Lb
            wr.j6 r0 = wr.j6.INTERNAL
            goto L37
        Lb:
            r0 = 400(0x190, float:5.6E-43)
            if (r3 == r0) goto L35
            r0 = 401(0x191, float:5.62E-43)
            if (r3 == r0) goto L32
            r0 = 403(0x193, float:5.65E-43)
            if (r3 == r0) goto L2f
            r0 = 404(0x194, float:5.66E-43)
            if (r3 == r0) goto L2c
            r0 = 429(0x1ad, float:6.01E-43)
            if (r3 == r0) goto L29
            r0 = 431(0x1af, float:6.04E-43)
            if (r3 == r0) goto L35
            switch(r3) {
                case 502: goto L29;
                case 503: goto L29;
                case 504: goto L29;
                default: goto L26;
            }
        L26:
            wr.j6 r0 = wr.j6.UNKNOWN
            goto L37
        L29:
            wr.j6 r0 = wr.j6.UNAVAILABLE
            goto L37
        L2c:
            wr.j6 r0 = wr.j6.UNIMPLEMENTED
            goto L37
        L2f:
            wr.j6 r0 = wr.j6.PERMISSION_DENIED
            goto L37
        L32:
            wr.j6 r0 = wr.j6.UNAUTHENTICATED
            goto L37
        L35:
            wr.j6 r0 = wr.j6.INTERNAL
        L37:
            wr.m6 r0 = r0.toStatus()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "HTTP status code "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            wr.m6 r3 = r0.withDescription(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.c5.httpStatusToGrpcStatus(int):wr.m6");
    }

    public static boolean isGrpcContentType(String str) {
        char cCharAt;
        if (str == null || 16 > str.length()) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        if (lowerCase.startsWith("application/grpc")) {
            return lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';';
        }
        return false;
    }

    public static wr.m6 replaceInappropriateControlPlaneStatus(wr.m6 m6Var) {
        mh.p1.checkArgument(m6Var != null);
        if (!f92307b.contains(m6Var.getCode())) {
            return m6Var;
        }
        return wr.m6.f91046n.withDescription("Inappropriate status code from control plane: " + m6Var.getCode() + " " + m6Var.getDescription()).withCause(m6Var.getCause());
    }

    public static boolean shouldBeCountedForInUse(wr.i iVar) {
        return !Boolean.TRUE.equals(iVar.getOption(f92323r));
    }

    static {
        wr.r3 r3Var = wr.e4.f90905d;
        f92310e = wr.z3.of("grpc-encoding", r3Var);
        f92311f = wr.p2.keyOf("grpc-accept-encoding", new y4());
        f92312g = wr.z3.of(rJqlArycrfkilN.yNqGj, r3Var);
        f92313h = wr.p2.keyOf("accept-encoding", new y4());
        f92314i = wr.z3.of("content-length", r3Var);
        f92315j = wr.z3.of("content-type", r3Var);
        f92316k = wr.z3.of("te", r3Var);
        f92317l = wr.z3.of("user-agent", r3Var);
        f92318m = mh.r2.on(AbstractJsonLexerKt.COMMA).trimResults();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f92319n = timeUnit.toNanos(20L);
        f92320o = TimeUnit.HOURS.toNanos(2L);
        f92321p = timeUnit.toNanos(20L);
        f92322q = new za();
        f92323r = wr.h.create("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        f92324s = new t4();
        f92325t = new u4();
        f92326u = new v4();
        f92327v = new w4();
    }

    public static String authorityFromHostAndPort(String str, int i10) {
        String str2;
        int i11;
        try {
            str2 = str;
            i11 = i10;
            try {
                return new URI(null, null, str2, i11, null, null, null).getAuthority();
            } catch (URISyntaxException e10) {
                e = e10;
                throw new IllegalArgumentException("Invalid host or port: " + str2 + QFzuMMDfrzagDN.zoJwhxgcEeoyUwF + i11, e);
            }
        } catch (URISyntaxException e11) {
            e = e11;
            str2 = str;
            i11 = i10;
        }
    }
}
