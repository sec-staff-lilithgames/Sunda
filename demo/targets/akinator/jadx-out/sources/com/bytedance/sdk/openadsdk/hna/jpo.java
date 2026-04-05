package com.bytedance.sdk.openadsdk.hna;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.nmd;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import hr.kNq.ikJMrW;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jpo implements Comparable<jpo> {

    /* renamed from: jd, reason: collision with root package name */
    private final String f21181jd;
    private int my;
    private long oya;

    /* renamed from: qk, reason: collision with root package name */
    private int f21184qk;
    private int wqx;
    private final ArrayList<Long> jpo = new ArrayList<>();

    /* renamed from: cm, reason: collision with root package name */
    private final ArrayList<Long> f21180cm = new ArrayList<>();

    /* renamed from: jj, reason: collision with root package name */
    private final ArrayList<Long> f21182jj = new ArrayList<>();
    private final ArrayList<Long> xyk = new ArrayList<>();
    private final HashMap<String, jd> zz = new HashMap<>();

    /* renamed from: yd, reason: collision with root package name */
    private int f21185yd = 0;

    /* renamed from: ju, reason: collision with root package name */
    private int f21183ju = 0;

    /* renamed from: if, reason: not valid java name */
    private final HashMap<String, jd> f152if = new HashMap<>();

    /* renamed from: au, reason: collision with root package name */
    private int f21179au = 0;
    private final ArrayList<String> prr = new ArrayList<>();

    public jpo(String str) {
        this.f21181jd = str;
    }

    private void jd(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i10;
        int i11;
        int i12;
        int[] iArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int[] iArrM485if = com.bytedance.sdk.openadsdk.jj.jpo.jpo().m485if();
        if (iArrM485if != null) {
            int i13 = 0;
            while (i13 < iArrM485if.length) {
                int i14 = iArrM485if[i13];
                long j10 = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                long j11 = jElapsedRealtime - (i14 * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                Iterator<String> it = this.f152if.keySet().iterator();
                long j12 = 0;
                while (it.hasNext()) {
                    long j13 = j10;
                    String next = it.next();
                    Iterator<String> it2 = it;
                    jd jdVar = this.f152if.get(next);
                    if (jdVar != null) {
                        long jJpo = jdVar.jpo(j11, jElapsedRealtime);
                        j12 += jJpo;
                        if (jJpo <= 0 && i13 == iArrM485if.length - 1) {
                            hashSet.add(next);
                        }
                    }
                    it = it2;
                    j10 = j13;
                }
                if (j12 != 0) {
                    String strValueOf = String.valueOf(i14);
                    String str = ikJMrW.CwPlTXlVdTXkX;
                    jSONObject.put(str.concat(strValueOf), j12);
                    iArr = iArrM485if;
                    long jOptInt = jSONObject2.optInt(str.concat(String.valueOf(i14))) + j12;
                    if (jOptInt != 0) {
                        jSONObject2.put(str.concat(String.valueOf(i14)), jOptInt);
                    }
                } else {
                    iArr = iArrM485if;
                }
                i13++;
                iArrM485if = iArr;
            }
        }
        int[] iArrAu = com.bytedance.sdk.openadsdk.jj.jpo.jpo().au();
        if (iArrAu != null) {
            int i15 = 0;
            while (i15 < iArrAu.length) {
                int i16 = iArrAu[i15];
                long j14 = jElapsedRealtime - (i16 * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                long j15 = 0;
                int i17 = 0;
                for (String str2 : this.zz.keySet()) {
                    HashSet hashSet3 = hashSet;
                    int i18 = i16;
                    jd jdVar2 = this.zz.get(str2);
                    if (jdVar2 != null) {
                        long jJpo2 = jdVar2.jpo(j14, jElapsedRealtime);
                        j15 += jJpo2;
                        if (jJpo2 > 20000) {
                            i17++;
                        }
                        if (jJpo2 <= 0 && i15 == iArrAu.length - 1) {
                            hashSet2.add(str2);
                        }
                    }
                    i16 = i18;
                    hashSet = hashSet3;
                }
                HashSet hashSet4 = hashSet;
                int i19 = i16;
                if (j15 != 0) {
                    jSONObject.put("v_stay_t_".concat(String.valueOf(i19)), j15);
                    long jOptInt2 = jSONObject2.optInt("v_stay_t_".concat(String.valueOf(i19))) + j15;
                    if (jOptInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(String.valueOf(i19)), jOptInt2);
                    }
                }
                if (i17 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(String.valueOf(i19)), i17);
                    int iOptInt = jSONObject2.optInt("v_20s_play_c_".concat(String.valueOf(i19))) + i17;
                    if (iOptInt != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(String.valueOf(i19)), iOptInt);
                    }
                }
                i15++;
                hashSet = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet;
        if (!hashSet5.isEmpty()) {
            Iterator it3 = hashSet5.iterator();
            while (it3.hasNext()) {
                this.f152if.remove((String) it3.next());
            }
        }
        if (!hashSet2.isEmpty()) {
            Iterator it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                this.zz.remove((String) it4.next());
            }
        }
        if (com.bytedance.sdk.openadsdk.jj.jpo.jpo().prr() && (i12 = this.f21185yd) != 0) {
            jSONObject.put("v_stay_t_s", i12);
            int iOptInt2 = jSONObject2.optInt("v_stay_t_s") + this.f21185yd;
            if (iOptInt2 != 0) {
                jSONObject2.put("v_stay_t_s", iOptInt2);
            }
        }
        if (com.bytedance.sdk.openadsdk.jj.jpo.jpo().oya() && (i11 = this.f21179au) != 0) {
            jSONObject.put("lp_stay_t_s", i11);
            int iOptInt3 = jSONObject2.optInt("lp_stay_t_s") + this.f21179au;
            if (iOptInt3 != 0) {
                jSONObject2.put("lp_stay_t_s", iOptInt3);
            }
        }
        if (!com.bytedance.sdk.openadsdk.jj.jpo.jpo().sq() || (i10 = this.f21183ju) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i10);
        int iOptInt4 = jSONObject2.optInt("v_30p_play_c_s") + this.f21183ju;
        if (iOptInt4 != 0) {
            jSONObject2.put("v_30p_play_c_s", iOptInt4);
        }
    }

    public void jpo(String str, String str2) {
        jd jdVar;
        jd jdVar2;
        jd jdVar3;
        jd jdVar4;
        jd jdVar5;
        jd jdVar6;
        str.getClass();
        switch (str) {
            case "landingContinue":
                if (!TextUtils.isEmpty(str2) && (jdVar = this.f152if.get(str2)) != null) {
                    jdVar.cm(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingPause":
                if (!TextUtils.isEmpty(str2) && (jdVar2 = this.f152if.get(str2)) != null) {
                    jdVar2.wqx(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingStart":
                if (!TextUtils.isEmpty(str2) && this.f152if.get(str2) == null) {
                    jd jdVar7 = new jd();
                    this.f152if.put(str2, jdVar7);
                    jdVar7.jpo(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_over":
            case "feed_break":
            case "videoForceBreak":
            case "play_error":
                if (!TextUtils.isEmpty(str2) && (jdVar3 = this.zz.get(str2)) != null && jdVar3.jpo() != jd.my) {
                    jdVar3.jd(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.jj.jpo.jpo().prr()) {
                        this.f21185yd = (int) (jdVar3.jpo(this.oya, SystemClock.elapsedRealtime()) + this.f21185yd);
                        break;
                    }
                }
                break;
            case "feed_play":
                this.f21182jj.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.jj.jpo.jpo().xyk()) {
                    this.f21184qk++;
                }
                if (!TextUtils.isEmpty(str2) && this.zz.get(str2) == null) {
                    jd jdVar8 = new jd();
                    this.zz.put(str2, jdVar8);
                    jdVar8.jpo(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "show":
                this.jpo.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.jj.jpo.jpo().jj()) {
                    this.wqx++;
                    break;
                }
                break;
            case "click":
                if (!this.prr.contains(str2)) {
                    if (this.prr.size() > 50) {
                        this.prr.subList(0, 25).clear();
                    }
                    this.prr.add(str2);
                    this.f21180cm.add(Long.valueOf(SystemClock.elapsedRealtime()));
                    if (com.bytedance.sdk.openadsdk.jj.jpo.jpo().qk()) {
                        this.my++;
                        break;
                    }
                }
                break;
            case "feed_continue":
                if (!TextUtils.isEmpty(str2) && (jdVar4 = this.zz.get(str2)) != null) {
                    jdVar4.cm(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_pause":
                if (!TextUtils.isEmpty(str2) && (jdVar5 = this.zz.get(str2)) != null) {
                    jdVar5.wqx(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingFinish":
                if (!TextUtils.isEmpty(str2) && (jdVar6 = this.f152if.get(str2)) != null && jdVar6.jpo() != jd.my) {
                    jdVar6.jd(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.jj.jpo.jpo().oya()) {
                        this.f21179au = (int) (jdVar6.jpo(this.oya, SystemClock.elapsedRealtime()) + this.f21179au);
                        break;
                    }
                }
                break;
            case "videoPercent30":
                if (com.bytedance.sdk.openadsdk.jj.jpo.jpo().sq()) {
                    this.f21183ju++;
                    break;
                }
                break;
            case "dislike":
                this.xyk.add(Long.valueOf(SystemClock.elapsedRealtime()));
                break;
        }
    }

    public String jd() {
        return this.f21181jd;
    }

    public JSONObject jpo(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jpo(jSONObject2, jSONObject);
            jd(jSONObject2, jSONObject);
            return jSONObject2;
        } catch (Throwable th2) {
            nmd.wqx(th2.getMessage(), new Object[0]);
            return jSONObject2;
        }
    }

    private void jpo(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j10, JSONObject jSONObject2) throws JSONException {
        int size = arrayList.size() - 1;
        int i10 = 0;
        for (int i11 : iArr) {
            long j11 = j10 - (i11 * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            while (size >= 0 && arrayList.get(size).longValue() >= j11) {
                i10++;
                size--;
            }
            if (i10 != 0) {
                jSONObject.put(str + i11, i10);
                int iOptInt = jSONObject2.optInt(str + i11) + i10;
                if (iOptInt != 0) {
                    jSONObject2.put(str + i11, iOptInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    private void jpo(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i10;
        int i11;
        int i12;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        jpo("show_c_", jSONObject, this.jpo, com.bytedance.sdk.openadsdk.jj.jpo.jpo().zz(), jElapsedRealtime, jSONObject2);
        jpo("click_c_", jSONObject, this.f21180cm, com.bytedance.sdk.openadsdk.jj.jpo.jpo().yd(), jElapsedRealtime, jSONObject2);
        jpo("v_play_c_", jSONObject, this.f21182jj, com.bytedance.sdk.openadsdk.jj.jpo.jpo().ju(), jElapsedRealtime, jSONObject2);
        jpo("dislike_c_", jSONObject, this.xyk, com.bytedance.sdk.openadsdk.jj.jpo.jpo().hna(), jElapsedRealtime, jSONObject2);
        if (com.bytedance.sdk.openadsdk.jj.jpo.jpo().jj() && (i12 = this.wqx) != 0) {
            jSONObject.put("show_c_s", i12);
            int iOptInt = jSONObject2.optInt("show_c_s") + this.wqx;
            if (iOptInt != 0) {
                jSONObject2.put("show_c_s", iOptInt);
            }
        }
        if (com.bytedance.sdk.openadsdk.jj.jpo.jpo().qk() && (i11 = this.my) != 0) {
            jSONObject.put("click_c_s", i11);
            int iOptInt2 = jSONObject2.optInt("click_c_s") + this.my;
            if (iOptInt2 != 0) {
                jSONObject2.put("click_c_s", iOptInt2);
            }
        }
        if (!com.bytedance.sdk.openadsdk.jj.jpo.jpo().xyk() || (i10 = this.f21184qk) == 0) {
            return;
        }
        jSONObject.put("v_play_c_s", i10);
        int iOptInt3 = jSONObject2.optInt("v_play_c_s") + this.f21184qk;
        if (iOptInt3 != 0) {
            jSONObject2.put("v_play_c_s", iOptInt3);
        }
    }

    public void jpo() {
        this.oya = SystemClock.elapsedRealtime();
        this.f21183ju = 0;
        this.my = 0;
        this.wqx = 0;
        this.f21179au = 0;
        this.f21185yd = 0;
        this.f21184qk = 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
    public int compareTo(jpo jpoVar) {
        return jpoVar.wqx - this.wqx;
    }
}
