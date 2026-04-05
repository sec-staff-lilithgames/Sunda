package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.model.vast.a0;
import com.fyber.inneractive.sdk.model.vast.r;
import com.fyber.inneractive.sdk.model.vast.u;
import com.fyber.inneractive.sdk.model.vast.y;
import com.fyber.inneractive.sdk.model.vast.z;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.s;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends b {

    /* renamed from: e, reason: collision with root package name */
    public g f26622e;

    /* renamed from: f, reason: collision with root package name */
    public r0 f26623f;

    /* renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.model.vast.f f26624g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f26625h;

    /* renamed from: i, reason: collision with root package name */
    public int f26626i;

    /* renamed from: j, reason: collision with root package name */
    public z f26627j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f26628k;

    public d() {
        this.f26628k = true;
        this.f26625h = new ArrayList();
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final e a() {
        g gVar = new g();
        this.f26618a = gVar;
        this.f26622e = gVar;
        return gVar;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final boolean c() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final void a(String str, r0 r0Var) {
        this.f26623f = r0Var;
        if (r0Var != null && r0Var.f23348f != null) {
            this.f26622e.N = System.currentTimeMillis();
            this.f26622e.C = this.f26623f.f23344b;
            this.f26626i = IAConfigManager.O.f23214i.f23323b;
            try {
                a(str, 0);
                a(this.f26624g, this.f26625h);
                return;
            } catch (com.fyber.inneractive.sdk.flow.vast.h e10) {
                this.f26622e.f26637i = e10.getMessage();
                this.f26622e.f26638j = e10.getCause().getMessage();
                return;
            } catch (InterruptedException e11) {
                throw e11;
            } catch (Exception e12) {
                this.f26622e.f26638j = e12.getMessage();
                g gVar = this.f26622e;
                gVar.f26637i = "VastErrorInvalidFile";
                gVar.f26654z = e12;
                if (IAlog.f26748a == 2) {
                    e12.printStackTrace();
                    return;
                }
                return;
            }
        }
        this.f26618a.f26637i = "ErrorConfigurationMismatch";
    }

    public d(boolean z10) {
        this();
        this.f26628k = z10;
    }

    public final void a(String str, int i10) throws Exception {
        u uVarA;
        try {
            String strReplaceFirst = str.replaceFirst("<\\?.*\\?>", "");
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setCoalescing(true);
            Document document = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(new InputSource(new StringReader(strReplaceFirst)));
            if (document != null) {
                Node firstChild = document.getFirstChild();
                if (firstChild.getNodeName().equalsIgnoreCase("VAST")) {
                    uVarA = u.a(firstChild);
                } else {
                    IAlog.a("XML does not contain a VAST tag as its first child!", new Object[0]);
                    throw new Exception("XML does not contain a VAST tag as its first child!");
                }
            } else {
                uVarA = null;
            }
            try {
                if (this.f26627j == null) {
                    this.f26627j = new z(uVarA.f24142a);
                } else {
                    z zVar = new z(uVarA.f24142a);
                    if (zVar.compareTo(this.f26627j) >= 0) {
                        this.f26627j = zVar;
                    }
                }
            } catch (y unused) {
            }
            ArrayList arrayList = uVarA.f24143b;
            if (arrayList != null && !arrayList.isEmpty()) {
                com.fyber.inneractive.sdk.model.vast.f fVar = (com.fyber.inneractive.sdk.model.vast.f) arrayList.get(0);
                a0 a0Var = fVar.f24100b;
                if (a0Var != null) {
                    IAlog.a("Vast response parser: found VAST wrapper #%d", Integer.valueOf(this.f26625h.size()));
                    int size = this.f26625h.size();
                    int i11 = this.f26626i;
                    if (size < i11) {
                        this.f26625h.add(fVar);
                        String str2 = a0Var.f24069i;
                        if (!TextUtils.isEmpty(str2)) {
                            if (h0.e(str2)) {
                                String strA = s.a(str2, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, 5000);
                                if (!TextUtils.isEmpty(strA)) {
                                    int i12 = this.f26626i - i10;
                                    if (i12 > 0) {
                                        a0Var.f24107f = i12;
                                        this.f26622e.S.put(str2, strA);
                                        a(strA, i10 + 1);
                                        return;
                                    }
                                    throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "Invalid level for wrapper");
                                }
                                throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "Failed getting data from ad tag URI");
                            }
                            IAlog.a("Vast response parser: Unsecure Wrapper URL. Aborting! url: %s", str2);
                            throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorUnsecure", "Unsecure ad tag URI for wrapper");
                        }
                        IAlog.a("Vast response parser: found an empty tag uri in wrapper! aborting!", new Object[0]);
                        throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "No ad tag URI for wrapper");
                    }
                    IAlog.a("Vast response parser: too many vast wrappers! Only %d allowed. stopping", Integer.valueOf(i11));
                    throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorTooManyWrappers", a.b.f(this.f26626i, " found", new StringBuilder("More than ")));
                }
                if (fVar.f24101c != null) {
                    this.f26624g = fVar;
                    return;
                }
                throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "A top level ad with no wrapper on inline found!");
            }
            IAlog.a("Vast response parser: no ads found in model. aborting", new Object[0]);
            throw new com.fyber.inneractive.sdk.flow.vast.h("ErrorNoMediaFiles", "No ads found in model. Empty Vast?");
        } catch (Exception e10) {
            IAlog.a("Failed parsing Vast file! parsing error = %s", e10.getMessage());
            throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", e10.getMessage());
        }
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.f fVar, List list) throws JSONException {
        String str;
        com.fyber.inneractive.sdk.flow.vast.c cVar = new com.fyber.inneractive.sdk.flow.vast.c(this.f26628k);
        int iIntValue = this.f26623f.f23348f.f23401c.intValue();
        int iIntValue2 = this.f26623f.f23348f.f23400b.intValue();
        int iIntValue3 = this.f26623f.f23348f.f23405g.intValue();
        cVar.f23907b = iIntValue;
        cVar.f23908c = iIntValue2;
        cVar.f23909d = iIntValue3;
        if (UnitDisplayType.VERTICAL.equals(this.f26623f.f23348f.f23408j)) {
            cVar.f23910e = true;
        }
        if (this.f26623f.f23348f.f23409k.contains(2)) {
            cVar.f23911f = true;
        }
        try {
            z zVar = this.f26627j;
            if (zVar == null) {
                str = "";
            } else {
                str = zVar.f24157b;
            }
            this.f26622e.O = cVar.a(fVar, list, str);
        } catch (com.fyber.inneractive.sdk.flow.vast.h e10) {
            g gVar = this.f26622e;
            gVar.getClass();
            gVar.f26637i = e10.getMessage();
        }
        com.fyber.inneractive.sdk.model.vast.b bVar = this.f26622e.O;
        if (bVar != null) {
            String str2 = bVar.f24083n;
            if (!TextUtils.isEmpty(str2) && h0.e(str2)) {
                w wVar = new w(com.fyber.inneractive.sdk.network.u.VAST_EVENT_DVC_DETECTED, (InneractiveAdRequest) null, this.f26618a);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("templateURL", str2);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str2);
                }
                wVar.f24329f.put(jSONObject);
                wVar.a((String) null);
            } else if (!TextUtils.isEmpty(str2)) {
                this.f26622e.O.f24083n = "";
                com.fyber.inneractive.sdk.network.events.a.a(t.VAST_ERROR_DVC_FAILURE, com.fyber.inneractive.sdk.network.events.b.SSL_ERROR, (InneractiveAdRequest) null, this.f26618a, "Unsecured URL", str2, Boolean.FALSE);
            }
        }
        g gVar2 = this.f26622e;
        LinkedHashMap linkedHashMap = cVar.f23912g;
        if (linkedHashMap != null) {
            gVar2.P.putAll(linkedHashMap);
        } else {
            gVar2.getClass();
        }
        g gVar3 = this.f26622e;
        ArrayList arrayList = cVar.f23913h;
        if (arrayList != null) {
            gVar3.Q.addAll(arrayList);
        } else {
            gVar3.getClass();
        }
        g gVar4 = this.f26622e;
        ArrayList arrayList2 = cVar.f23916k;
        if (arrayList2 != null) {
            gVar4.R.addAll(arrayList2);
        } else {
            gVar4.getClass();
        }
        if (IAlog.f26748a == 2) {
            LinkedHashMap linkedHashMap2 = cVar.f23912g;
            if (linkedHashMap2.size() > 0) {
                IAlog.e(" VParser: Unsupported media files:", new Object[0]);
                for (r rVar : linkedHashMap2.keySet()) {
                    IAlog.e("VParser: %s", rVar);
                    IAlog.e("VParser: reason = %s", linkedHashMap2.get(rVar));
                }
                return;
            }
            IAlog.e("VParser: Unsupported media files: none", new Object[0]);
        }
    }
}
