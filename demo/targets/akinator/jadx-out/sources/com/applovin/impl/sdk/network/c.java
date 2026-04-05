package com.applovin.impl.sdk.network;

import android.text.TextUtils;
import com.applovin.impl.g5;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.o;
import com.applovin.impl.v4;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c extends g5 {

    /* renamed from: g, reason: collision with root package name */
    private final b f15629g;

    /* renamed from: h, reason: collision with root package name */
    private final o f15630h;

    /* renamed from: i, reason: collision with root package name */
    private AtomicBoolean f15631i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15632j;

    public c(b bVar, k kVar) {
        super("PersistentPostbackQueueSaveTask", kVar);
        this.f15631i = new AtomicBoolean();
        this.f15632j = false;
        this.f15629g = bVar;
        this.f15630h = kVar.O();
    }

    public List a(int i10) throws Throwable {
        ArrayList arrayList = new ArrayList();
        m mVarH = this.f14003a.H();
        if (!mVarH.b("persistent_postback_cache.json", k.o())) {
            o.h("PersistentPostbackQueueSaveTask", "Postbacks queue file does not exist.");
            return arrayList;
        }
        File fileA = mVarH.a("persistent_postback_cache.json", k.o());
        String strF = mVarH.f(fileA);
        if (TextUtils.isEmpty(strF)) {
            o.h("PersistentPostbackQueueSaveTask", "Postbacks queue file has no content.");
            return arrayList;
        }
        boolean z10 = false;
        try {
            JSONArray jSONArray = new JSONObject(strF).getJSONArray("pb");
            if (o.a()) {
                this.f15630h.a("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s)...");
            }
            arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
            Integer num = (Integer) this.f14003a.a(v4.G2);
            for (int i11 = 0; i11 < jSONArray.length() && arrayList.size() < i10; i11++) {
                try {
                    d dVar = new d(jSONArray.getJSONObject(i11), this.f14003a);
                    if (dVar.c() < num.intValue()) {
                        arrayList.add(dVar);
                    } else {
                        o.h("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + dVar);
                    }
                } catch (Throwable th2) {
                    o.c("PersistentPostbackQueueSaveTask", "Unable to deserialize postback from json", th2);
                    this.f14003a.E().a("PersistentPostbackQueueSaveTask", "deserializePostback", th2);
                }
            }
            if (o.a()) {
                this.f15630h.a("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
            }
        } catch (Throwable th3) {
            try {
                o.c("PersistentPostbackQueueSaveTask", "Failed to load postback queue", th3);
                try {
                    this.f14003a.E().a("PersistentPostbackQueueSaveTask", "deserializePostbackQueue", th3);
                    if (((Boolean) this.f14003a.a(v4.N0)).booleanValue()) {
                        mVarH.a(fileA, "removeAfterDeserializationFail");
                    }
                } catch (Throwable th4) {
                    th = th4;
                    z10 = true;
                    if (z10 && ((Boolean) this.f14003a.a(v4.N0)).booleanValue()) {
                        mVarH.a(fileA, "removeAfterDeserializationFail");
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        this.f15632j = arrayList.isEmpty();
        return arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        a(this.f15629g.d());
    }

    private void a(List list) {
        if (!(this.f15632j && list.isEmpty()) && this.f15631i.compareAndSet(false, true)) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                try {
                    jSONArray.put(dVar.q());
                } catch (Throwable th2) {
                    o.c("PersistentPostbackQueueSaveTask", "Unable to serialize postback to JSON: " + dVar, th2);
                    this.f14003a.E().a("PersistentPostbackQueueSaveTask", "serializePostback", th2);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pb", jSONArray);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes(C.UTF8_NAME));
                m mVarH = this.f14003a.H();
                if (mVarH.a((InputStream) byteArrayInputStream, mVarH.a("persistent_postback_cache.json", k.o()), true)) {
                    if (o.a()) {
                        this.f15630h.a("PersistentPostbackQueueSaveTask", "Exported postback queue to disk.");
                    }
                } else if (o.a()) {
                    this.f15630h.b("PersistentPostbackQueueSaveTask", "Unable to export postback queue to disk.");
                }
            } catch (Throwable th3) {
                o.c("PersistentPostbackQueueSaveTask", "Unable to export postbacks to disk: " + jSONArray, th3);
                this.f14003a.E().a("PersistentPostbackQueueSaveTask", "serializePostbackQueue", th3);
            }
            this.f15631i.set(false);
        }
    }
}
