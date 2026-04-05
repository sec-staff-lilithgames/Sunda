package com.bytedance.adsdk.jpo.jd.my;

import com.bytedance.adsdk.jpo.jd.cm.cm;
import com.bytedance.adsdk.jpo.jd.cm.wqx;
import com.bytedance.adsdk.jpo.jd.jd.jpo.Cif;
import com.bytedance.adsdk.jpo.jd.jd.jpo.au;
import com.bytedance.adsdk.jpo.jd.jd.jpo.jj;
import com.bytedance.adsdk.jpo.jd.jd.jpo.jr;
import com.bytedance.adsdk.jpo.jd.jd.jpo.ju;
import com.bytedance.adsdk.jpo.jd.jd.jpo.my;
import com.bytedance.adsdk.jpo.jd.jd.jpo.opi;
import com.bytedance.adsdk.jpo.jd.jd.jpo.oya;
import com.bytedance.adsdk.jpo.jd.jd.jpo.sq;
import com.bytedance.adsdk.jpo.jd.jd.jpo.xyk;
import com.bytedance.adsdk.jpo.jd.jd.jpo.zz;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.jpo.jd.my.jd$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] jpo;

        static {
            int[] iArr = new int[wqx.values().length];
            jpo = iArr;
            try {
                iArr[wqx.MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                jpo[wqx.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                jpo[wqx.DIVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                jpo[wqx.MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                jpo[wqx.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                jpo[wqx.EQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                jpo[wqx.NOT_EQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                jpo[wqx.GT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                jpo[wqx.LT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                jpo[wqx.GT_EQ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                jpo[wqx.LT_EQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                jpo[wqx.DOUBLE_AMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                jpo[wqx.DOUBLE_BAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private static Deque<com.bytedance.adsdk.jpo.jd.jd.jpo> jd(List<com.bytedance.adsdk.jpo.jd.jd.jpo> list, String str, int i10) {
        LinkedList<com.bytedance.adsdk.jpo.jd.jd.jpo> linkedList = new LinkedList(list);
        int i11 = 5;
        while (i11 > 0) {
            LinkedList linkedList2 = new LinkedList();
            for (com.bytedance.adsdk.jpo.jd.jd.jpo jpoVar : linkedList) {
                if (!linkedList2.isEmpty() && wqx.jpo(((com.bytedance.adsdk.jpo.jd.jd.jpo) linkedList2.peekLast()).jpo()) && ((wqx) ((com.bytedance.adsdk.jpo.jd.jd.jpo) linkedList2.peekLast()).jpo()).jd() == i11) {
                    com.bytedance.adsdk.jpo.jd.jd.jpo jpoVar2 = (com.bytedance.adsdk.jpo.jd.jd.jpo) linkedList2.pollLast();
                    com.bytedance.adsdk.jpo.jd.jd.jpo jpoVar3 = (com.bytedance.adsdk.jpo.jd.jd.jpo) linkedList2.pollLast();
                    if (wqx.jpo(jpoVar3.jpo()) || wqx.jpo(jpoVar.jpo())) {
                        throw new IllegalArgumentException(str.substring(0, i10));
                    }
                    linkedList2.addLast(jpo(jpoVar3, jpoVar2, jpoVar));
                } else {
                    linkedList2.addLast(jpoVar);
                }
            }
            i11--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    public static com.bytedance.adsdk.jpo.jd.jd.jpo jpo(List<com.bytedance.adsdk.jpo.jd.jd.jpo> list, String str, int i10) {
        wqx(list, str, i10);
        Deque<com.bytedance.adsdk.jpo.jd.jd.jpo> dequeJpo = jpo(jd(list, str, i10));
        if (dequeJpo.size() == 1) {
            return dequeJpo.getFirst();
        }
        throw new IllegalStateException();
    }

    private static void wqx(List<com.bytedance.adsdk.jpo.jd.jd.jpo> list, String str, int i10) {
        Iterator<com.bytedance.adsdk.jpo.jd.jd.jpo> it = list.iterator();
        while (it.hasNext()) {
            if (cm.jpo(it.next().jpo())) {
                throw new IllegalArgumentException(str.substring(0, i10));
            }
        }
    }

    private static Deque<com.bytedance.adsdk.jpo.jd.jd.jpo> jpo(Deque<com.bytedance.adsdk.jpo.jd.jd.jpo> deque) {
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.adsdk.jpo.jd.jd.jpo jpoVar : deque) {
            if (!linkedList.isEmpty() && ((com.bytedance.adsdk.jpo.jd.jd.jpo) linkedList.peekLast()).jpo() == wqx.COLON) {
                linkedList.pollLast();
                com.bytedance.adsdk.jpo.jd.jd.jpo jpoVar2 = (com.bytedance.adsdk.jpo.jd.jd.jpo) linkedList.pollLast();
                if (((com.bytedance.adsdk.jpo.jd.jd.jpo) linkedList.pollLast()).jpo() == wqx.jpo) {
                    com.bytedance.adsdk.jpo.jd.jd.jpo jpoVar3 = (com.bytedance.adsdk.jpo.jd.jd.jpo) linkedList.pollLast();
                    jr jrVar = new jr();
                    jrVar.jpo(jpoVar3);
                    jrVar.jd(jpoVar2);
                    jrVar.wqx(jpoVar);
                    linkedList.addLast(jrVar);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                linkedList.addLast(jpoVar);
            }
        }
        return linkedList;
    }

    private static com.bytedance.adsdk.jpo.jd.jd.jpo jpo(com.bytedance.adsdk.jpo.jd.jd.jpo jpoVar, com.bytedance.adsdk.jpo.jd.jd.jpo jpoVar2, com.bytedance.adsdk.jpo.jd.jd.jpo jpoVar3) {
        sq juVar;
        switch (AnonymousClass1.jpo[((wqx) jpoVar2.jpo()).ordinal()]) {
            case 1:
                juVar = new ju();
                break;
            case 2:
                juVar = new opi();
                break;
            case 3:
                juVar = new com.bytedance.adsdk.jpo.jd.jd.jpo.jpo();
                break;
            case 4:
                juVar = new au();
                break;
            case 5:
                juVar = new Cif();
                break;
            case 6:
                juVar = new com.bytedance.adsdk.jpo.jd.jd.jpo.cm();
                break;
            case 7:
                juVar = new oya();
                break;
            case 8:
                juVar = new jj();
                break;
            case 9:
                juVar = new zz();
                break;
            case 10:
                juVar = new my();
                break;
            case 11:
                juVar = new xyk();
                break;
            case 12:
                juVar = new com.bytedance.adsdk.jpo.jd.jd.jpo.jd();
                break;
            case 13:
                juVar = new com.bytedance.adsdk.jpo.jd.jd.jpo.wqx();
                break;
            default:
                throw new UnsupportedOperationException(jpoVar2.jpo().toString());
        }
        juVar.jpo(jpoVar);
        juVar.jd(jpoVar3);
        return juVar;
    }

    public static boolean jpo(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return !(obj instanceof Number) || ((Number) obj).floatValue() >= 0.0f;
        }
        return false;
    }
}
