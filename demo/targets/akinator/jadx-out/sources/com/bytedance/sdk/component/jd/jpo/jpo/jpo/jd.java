package com.bytedance.sdk.component.jd.jpo.jpo.jpo;

import android.text.TextUtils;
import com.bytedance.sdk.component.jd.jpo.Cif;
import com.bytedance.sdk.component.jd.jpo.au;
import com.bytedance.sdk.component.jd.jpo.ju;
import com.bytedance.sdk.component.jd.jpo.oya;
import com.bytedance.sdk.component.jd.jpo.xyk;
import com.ironsource.C3271ic;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements com.bytedance.sdk.component.jd.jpo.jd {

    /* renamed from: cm, reason: collision with root package name */
    private static List<Object> f18574cm;

    /* renamed from: jd, reason: collision with root package name */
    com.bytedance.sdk.component.jd.jpo.cm f18575jd;
    Cif jpo;
    private AtomicBoolean wqx = new AtomicBoolean(false);

    static {
        try {
            f18574cm = new ArrayList();
            Class<?> cls = Class.forName("com.android.okhttp.Protocol");
            Enum enumValueOf = Enum.valueOf(cls, "HTTP_1_1");
            if (enumValueOf != null) {
                f18574cm.add(enumValueOf);
            }
            Enum enumValueOf2 = Enum.valueOf(cls, "HTTP_2");
            if (enumValueOf2 != null) {
                f18574cm.add(enumValueOf2);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public jd(Cif cif, com.bytedance.sdk.component.jd.jpo.cm cmVar) {
        this.jpo = cif;
        this.f18575jd = cmVar;
    }

    private boolean my() {
        if (this.jpo.cm() == null) {
            return false;
        }
        return this.jpo.cm().containsKey("Content-Type");
    }

    /* renamed from: cm, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.jd.jpo.jd clone() {
        return new jd(this.jpo, this.f18575jd);
    }

    @Override // com.bytedance.sdk.component.jd.jpo.jd
    public oya jd() throws IOException {
        List<com.bytedance.sdk.component.jd.jpo.xyk> list;
        com.bytedance.sdk.component.wqx.jpo.jpo jpoVar;
        Cif cif = this.jpo;
        if (cif != null && (jpoVar = cif.f18559jd) != null) {
            if (jpoVar.oya() == 0) {
                this.jpo.f18559jd.prr();
            }
            this.jpo.f18559jd.jpo();
        }
        this.f18575jd.wqx().remove(this);
        this.f18575jd.cm().add(this);
        com.bytedance.sdk.component.jd.jpo.cm cmVar = this.f18575jd;
        if (cmVar instanceof jj) {
            if (this.f18575jd.cm().size() + cmVar.wqx().size() > this.f18575jd.jpo() || this.wqx.get()) {
                this.f18575jd.cm().remove(this);
                return new xyk(xyk.jpo, "Maximum number of requests exceeded", this.jpo);
            }
        }
        try {
            ju juVar = this.jpo.jpo;
            if (juVar == null || (list = juVar.jpo) == null || list.size() <= 0) {
                return jpo(this.jpo);
            }
            ArrayList arrayList = new ArrayList(this.jpo.jpo.jpo);
            arrayList.add(new com.bytedance.sdk.component.jd.jpo.xyk() { // from class: com.bytedance.sdk.component.jd.jpo.jpo.jpo.jd.1
                @Override // com.bytedance.sdk.component.jd.jpo.xyk
                public oya jpo(xyk.jpo jpoVar2) throws IOException {
                    return jd.this.jpo(jpoVar2.jpo());
                }
            });
            return ((com.bytedance.sdk.component.jd.jpo.xyk) arrayList.get(0)).jpo(new wqx(arrayList, this.jpo));
        } catch (Throwable th2) {
            throw new IOException(th2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.jd.jpo.jd
    public Cif jpo() {
        return this.jpo;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.jd
    public void wqx() {
        this.wqx.set(true);
    }

    private boolean jpo(au auVar) {
        Cif cif;
        byte[] bArr;
        return auVar != null && (cif = this.jpo) != null && C3271ic.f36944b.equalsIgnoreCase(cif.wqx()) && auVar.f18557jj == au.jpo.BYTE_ARRAY_TYPE && (bArr = auVar.my) != null && bArr.length > 0;
    }

    public oya jpo(Cif cif) throws IOException {
        return jpo(cif, com.bytedance.sdk.component.qk.jpo.my());
    }

    public oya jpo(Cif cif, boolean z10) throws IOException {
        HttpURLConnection httpURLConnection;
        IOException e10;
        String strJpo;
        int responseCode = xyk.jpo;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(cif.jd().jpo().toString()).openConnection();
                if (z10) {
                    try {
                        if (!"setting".equals(cif.jj()) && !"gecko".equals(cif.jj()) && !"load_ug_t".equals(cif.jj())) {
                            jpo(httpURLConnection);
                        }
                    } catch (IOException e11) {
                        e10 = e11;
                        if (responseCode == -1 && z10) {
                            oya oyaVarJpo = jpo(cif, false);
                            this.f18575jd.cm().remove(this);
                            return oyaVarJpo;
                        }
                        strJpo = jpo(httpURLConnection, e10);
                        this.f18575jd.cm().remove(this);
                        return new xyk(responseCode, strJpo, cif);
                    } catch (Exception e12) {
                        e = e12;
                        httpURLConnection2 = httpURLConnection;
                        strJpo = jpo(httpURLConnection2, e);
                        this.f18575jd.cm().remove(this);
                        return new xyk(responseCode, strJpo, cif);
                    }
                }
                if (cif.cm() != null && cif.cm().size() > 0) {
                    for (Map.Entry<String, List<String>> entry : cif.cm().entrySet()) {
                        String key = entry.getKey();
                        for (String str : entry.getValue()) {
                            if ("_disable_retry".equals(key) && "1".equals(str)) {
                                jd(httpURLConnection);
                            } else {
                                httpURLConnection.addRequestProperty(key, str);
                            }
                        }
                    }
                }
                ju juVar = cif.jpo;
                if (juVar != null) {
                    TimeUnit timeUnit = juVar.wqx;
                    if (timeUnit != null) {
                        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(juVar.f18587jd));
                    }
                    ju juVar2 = cif.jpo;
                    if (juVar2.wqx != null) {
                        httpURLConnection.setReadTimeout((int) juVar2.my.toMillis(juVar2.f18586cm));
                    }
                }
                if (cif.xyk() == null) {
                    httpURLConnection.setRequestMethod(C3271ic.f36943a);
                } else {
                    if (!my() && cif.xyk().wqx != null) {
                        httpURLConnection.addRequestProperty("Content-Type", cif.xyk().wqx.jpo());
                    }
                    httpURLConnection.setRequestMethod(cif.wqx());
                    if (C3271ic.f36944b.equalsIgnoreCase(cif.wqx())) {
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        if (jpo(cif.xyk())) {
                            outputStream.write(cif.xyk().my);
                        } else if (jd(cif.xyk())) {
                            outputStream.write(cif.xyk().f18556cm.getBytes());
                        }
                        outputStream.flush();
                        outputStream.close();
                    }
                }
                com.bytedance.sdk.component.wqx.jpo.jpo jpoVar = cif.f18559jd;
                if (jpoVar != null) {
                    jpoVar.jd();
                }
                httpURLConnection.connect();
                com.bytedance.sdk.component.wqx.jpo.jpo jpoVar2 = cif.f18559jd;
                if (jpoVar2 != null) {
                    jpoVar2.wqx();
                }
                responseCode = httpURLConnection.getResponseCode();
                com.bytedance.sdk.component.wqx.jpo.jpo jpoVar3 = cif.f18559jd;
                if (jpoVar3 != null) {
                    jpoVar3.my();
                }
            } catch (Throwable th2) {
                this.f18575jd.cm().remove(this);
                throw th2;
            }
        } catch (IOException e13) {
            httpURLConnection = null;
            e10 = e13;
        } catch (Exception e14) {
            e = e14;
        }
        if (this.wqx.get()) {
            httpURLConnection.disconnect();
            this.f18575jd.cm().remove(this);
            strJpo = "internal error";
            return new xyk(responseCode, strJpo, cif);
        }
        xyk xykVar = new xyk(httpURLConnection, cif);
        this.f18575jd.cm().remove(this);
        return xykVar;
    }

    private boolean jd(au auVar) {
        Cif cif;
        return (auVar == null || (cif = this.jpo) == null || !C3271ic.f36944b.equalsIgnoreCase(cif.wqx()) || auVar.f18557jj != au.jpo.STRING_TYPE || TextUtils.isEmpty(auVar.f18556cm)) ? false : true;
    }

    private static void jd(HttpURLConnection httpURLConnection) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            obj2.getClass().getDeclaredMethod("setRetryOnConnectionFailure", Boolean.TYPE).invoke(obj2, Boolean.FALSE);
        } catch (Exception unused) {
        }
    }

    private static String jpo(HttpURLConnection httpURLConnection, Exception exc) {
        try {
            return httpURLConnection.getErrorStream().toString();
        } catch (Throwable unused) {
            return exc.getMessage();
        }
    }

    private static void jpo(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (f18574cm.size() == 2) {
                obj2.getClass().getDeclaredMethod("setProtocols", List.class).invoke(obj2, f18574cm);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // com.bytedance.sdk.component.jd.jpo.jd
    public void jpo(final com.bytedance.sdk.component.jd.jpo.wqx wqxVar) {
        com.bytedance.sdk.component.wqx.jpo.jpo jpoVar;
        Cif cif = this.jpo;
        if (cif != null && (jpoVar = cif.f18559jd) != null) {
            jpoVar.prr();
        }
        this.f18575jd.jd().submit(new com.bytedance.sdk.component.xyk.wqx.jd(this.jpo.qk(), this.jpo.jj()) { // from class: com.bytedance.sdk.component.jd.jpo.jpo.jpo.jd.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    oya oyaVarJd = jd.this.jd();
                    if (oyaVarJd == null) {
                        wqxVar.jpo(jd.this, new IOException("response is null"));
                    } else {
                        wqxVar.jpo(jd.this, oyaVarJd);
                    }
                } catch (IOException e10) {
                    wqxVar.jpo(jd.this, e10);
                }
            }
        });
    }
}
