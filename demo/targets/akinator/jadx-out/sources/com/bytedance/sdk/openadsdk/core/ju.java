package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import b0.e2;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.se;
import com.mbridge.msdk.foundation.download.Command;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju {
    private static final AtomicInteger jpo = new AtomicInteger(0);

    /* renamed from: jd, reason: collision with root package name */
    private static final AtomicBoolean f20465jd = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public static void cm() {
        if (jpo.getAndIncrement() <= 0) {
            com.bytedance.sdk.openadsdk.utils.duq.jpo().schedule(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ju.2
                @Override // java.lang.Runnable
                public void run() {
                    ju.jd(Cif.jpo(sq.jpo()));
                }
            }, 10000L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void wqx() {
        jpo.set(0);
    }

    public static void jd(final String str) {
        com.bytedance.sdk.openadsdk.utils.duq.wqx(new com.bytedance.sdk.component.xyk.xyk("ipv6") { // from class: com.bytedance.sdk.openadsdk.core.ju.1
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                JSONObject jSONObjectJpo;
                final String strJr = com.bytedance.sdk.openadsdk.utils.tic.jr();
                com.bytedance.sdk.openadsdk.prr.wqx.jpo(0, strJr);
                com.bytedance.sdk.openadsdk.sq.wqx.jpo(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.ju.1.1
                    @Override // com.bytedance.sdk.openadsdk.sq.cm
                    public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                        return a.h("ipv6");
                    }
                });
                if (TextUtils.isEmpty(strJr)) {
                    com.bytedance.sdk.openadsdk.prr.wqx.jpo(-1, strJr, -1, "url is null");
                    com.bytedance.sdk.openadsdk.prr.jpo.my.jpo("ipv6", "", -2, "url is null");
                    com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.ju.1.2
                        @Override // com.bytedance.sdk.openadsdk.sq.cm
                        public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                            return a.h("ipv6");
                        }
                    });
                    return;
                }
                com.bytedance.sdk.component.qk.jd.cm cmVarJd = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().jd();
                try {
                    cmVarJd.jd(strJr);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("connect_type", com.bytedance.sdk.component.utils.se.jpo(sq.jpo(), 0L));
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("device_id", Long.parseLong(str));
                    }
                    jSONObject.put("header", com.bytedance.sdk.openadsdk.cm.jpo.wqx.jpo().jd());
                    if (com.bytedance.sdk.openadsdk.core.settings.au.jrx().jpo(PangleEncryptConstant.CryptDataScene.APP_LOG)) {
                        jSONObjectJpo = PangleEncryptManager.encryptType4(jSONObject, new hmu(PangleEncryptConstant.CryptDataScene.DUAL_EVENT));
                        if (jSONObjectJpo == null || jSONObjectJpo.optInt("cypher") != 4) {
                            nq.jd(false);
                        } else {
                            nq.jd(true);
                            cmVarJd.jd("x-pgli18n", "4");
                            cmVarJd.jd("Content-Type", "application/json; charset=utf-8");
                        }
                    } else {
                        jSONObjectJpo = com.bytedance.sdk.component.utils.jpo.jpo(jSONObject);
                        if (ju.jd(jSONObjectJpo)) {
                            cmVarJd.jd("Content-Encoding", "union_sdk_encode");
                        }
                    }
                    if (ju.jd(jSONObjectJpo)) {
                        jSONObject = jSONObjectJpo;
                    }
                    cmVarJd.jd("Content-Type", "application/json; charset=utf-8");
                    cmVarJd.jd(Command.HTTP_HEADER_USER_AGENT, com.bytedance.sdk.openadsdk.utils.tic.cm());
                    cmVarJd.jpo(jSONObject);
                    cmVarJd.jpo(6);
                    cmVarJd.jpo("send_i_p_v6");
                    cmVarJd.jpo(new com.bytedance.sdk.component.qk.jpo.jpo() { // from class: com.bytedance.sdk.openadsdk.core.ju.1.3
                        @Override // com.bytedance.sdk.component.qk.jpo.jpo
                        public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, com.bytedance.sdk.component.qk.jd jdVar) {
                            if (jdVar.jj()) {
                                ju.jd(jdVar.cm(), strJr);
                                return;
                            }
                            com.bytedance.sdk.openadsdk.prr.wqx.jpo(-1, strJr, jdVar.jpo(), jdVar.jd());
                            com.bytedance.sdk.openadsdk.prr.jpo.my.jpo("ipv6", strJr, jdVar.jpo(), jdVar.jd());
                            com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.ju.1.3.1
                                @Override // com.bytedance.sdk.openadsdk.sq.cm
                                public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                    return a.h("ipv6");
                                }
                            });
                            ju.cm();
                        }

                        @Override // com.bytedance.sdk.component.qk.jpo.jpo
                        public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, IOException iOException) {
                            if (iOException != null) {
                                com.bytedance.sdk.openadsdk.prr.wqx.jpo(-1, strJr, 1, iOException.getMessage());
                                com.bytedance.sdk.openadsdk.prr.jpo.my.jpo("ipv6", strJr, -1, iOException.getMessage());
                                com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.ju.1.3.2
                                    @Override // com.bytedance.sdk.openadsdk.sq.cm
                                    public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                        return a.h("ipv6");
                                    }
                                });
                            }
                            ju.cm();
                        }
                    });
                } catch (Exception e10) {
                    com.bytedance.sdk.openadsdk.prr.wqx.jpo(-1, strJr, -2, e10.getMessage());
                    com.bytedance.sdk.openadsdk.prr.jpo.my.jpo("ipv6", strJr, -3, e10.getMessage());
                    com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.ju.1.4
                        @Override // com.bytedance.sdk.openadsdk.sq.cm
                        public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                            return a.h("ipv6");
                        }
                    });
                    com.bytedance.sdk.component.utils.nmd.wqx(e2.l(e10, new StringBuilder("build ipv6 request failed:")), new Object[0]);
                }
            }
        });
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo implements se.jpo {
        private static final AtomicBoolean jpo = new AtomicBoolean(false);

        /* renamed from: jd, reason: collision with root package name */
        private static volatile long f20532jd = -1;

        private jpo() {
        }

        public static void jpo() {
            if (jpo.compareAndSet(false, true)) {
                f20532jd = System.currentTimeMillis();
                com.bytedance.sdk.component.utils.se.jpo(new jpo(), sq.jpo());
            }
        }

        public void jd() {
            com.bytedance.sdk.component.utils.se.jpo(this);
        }

        @Override // com.bytedance.sdk.component.utils.se.jpo
        public void jpo(Context context, Intent intent, boolean z10, int i10) {
            if (System.currentTimeMillis() - f20532jd >= 2000 && i10 != 0) {
                ju.wqx();
                ju.jd(Cif.jpo(sq.jpo()));
                jd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jd(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("cypher") != 4) {
                com.bytedance.sdk.openadsdk.prr.wqx.jpo(-1, str2, 1, "cypher type error");
                com.bytedance.sdk.openadsdk.prr.jpo.my.jpo("ipv6", str2, -4, "cypher type error");
                com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.ju.3
                    @Override // com.bytedance.sdk.openadsdk.sq.cm
                    public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                        return a.h("ipv6");
                    }
                });
                return;
            }
            Pair<Integer, String> pairDecryptType4 = PangleEncryptManager.decryptType4(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
            if (pairDecryptType4.second != null) {
                JSONObject jSONObject2 = new JSONObject((String) pairDecryptType4.second);
                String strOptString = jSONObject2.optString("ip_type");
                int iHashCode = strOptString.hashCode();
                if (iHashCode != 3239397) {
                    if (iHashCode != 3239399) {
                        if (iHashCode == 1959784951 && strOptString.equals("invalid")) {
                            return;
                        }
                    } else if (strOptString.equals("ipv6")) {
                        if (jSONObject2.has("ip")) {
                            String strOptString2 = jSONObject2.optString("ip");
                            com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, strOptString2);
                            com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("ttopenadsdk", "key_ipv4");
                            HashMap map = new HashMap();
                            map.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, strOptString2);
                            com.bytedance.sdk.openadsdk.core.yd.jd.jd().jpo(map);
                            com.bytedance.sdk.openadsdk.prr.wqx.jpo(1, str2);
                            com.bytedance.sdk.openadsdk.sq.wqx.jd(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.ju.5
                                @Override // com.bytedance.sdk.openadsdk.sq.cm
                                public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                    return a.h("ipv6");
                                }
                            });
                            return;
                        }
                        com.bytedance.sdk.openadsdk.prr.wqx.jpo(-1, str2, 4, "no ip");
                        com.bytedance.sdk.openadsdk.prr.jpo.my.jpo("ipv6", str2, -6, "no ip");
                        com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.ju.6
                            @Override // com.bytedance.sdk.openadsdk.sq.cm
                            public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                return a.h("ipv6");
                            }
                        });
                        return;
                    }
                } else if (strOptString.equals("ipv4")) {
                    if (jSONObject2.has("ip")) {
                        com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("ttopenadsdk", "key_ipv4", jSONObject2.optString("ip"));
                        com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6);
                        com.bytedance.sdk.openadsdk.prr.wqx.jpo(1, str2);
                        com.bytedance.sdk.openadsdk.sq.wqx.jd(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.ju.7
                            @Override // com.bytedance.sdk.openadsdk.sq.cm
                            public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                return a.h("ipv6");
                            }
                        });
                        return;
                    }
                    com.bytedance.sdk.openadsdk.prr.wqx.jpo(-1, str2, 4, "no ip");
                    com.bytedance.sdk.openadsdk.prr.jpo.my.jpo("ipv6", str2, -6, "no ip");
                    com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.ju.8
                        @Override // com.bytedance.sdk.openadsdk.sq.cm
                        public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                            return a.h("ipv6");
                        }
                    });
                    return;
                }
                com.bytedance.sdk.openadsdk.prr.wqx.jpo(-1, str2, 3, "no ip type ");
                com.bytedance.sdk.openadsdk.prr.jpo.my.jpo("ipv6", str2, -7, "no ip type ");
                com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.ju.9
                    @Override // com.bytedance.sdk.openadsdk.sq.cm
                    public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                        return a.h("ipv6");
                    }
                });
                return;
            }
            int iIntValue = ((Integer) pairDecryptType4.first).intValue();
            com.bytedance.sdk.openadsdk.prr.wqx.jpo(-1, str2, 2, "decrypt failed ".concat(String.valueOf(iIntValue)));
            com.bytedance.sdk.openadsdk.prr.jpo.my.jpo("ipv6", str2, -5, "decrypt failed ".concat(String.valueOf(iIntValue)));
            com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.ju.4
                @Override // com.bytedance.sdk.openadsdk.sq.cm
                public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                    return a.h("ipv6");
                }
            });
        } catch (JSONException unused) {
            com.bytedance.sdk.openadsdk.prr.wqx.jpo(-1, str2, 2, "decrypt failed, wrong data ");
            com.bytedance.sdk.openadsdk.prr.jpo.my.jpo("ipv6", str2, -8, "decrypt failed, wrong data ");
            com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.ju.10
                @Override // com.bytedance.sdk.openadsdk.sq.cm
                public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                    return a.h("ipv6");
                }
            });
        }
    }

    public static void jpo(String str) {
        AtomicBoolean atomicBoolean = f20465jd;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!com.bytedance.sdk.component.utils.opi.xyk(sq.jpo())) {
                atomicBoolean.set(false);
            } else {
                jpo.jpo();
                jd(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean jd(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }
}
