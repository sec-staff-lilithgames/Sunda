package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import androidx.core.app.NotificationCompat;
import bp.oM.DwaEpyvxz;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class x7 {

    /* renamed from: a, reason: collision with root package name */
    private static final DateFormat f16211a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* renamed from: b, reason: collision with root package name */
    private static final Random f16212b = new Random(System.currentTimeMillis());

    public static void a(p7 p7Var, AppLovinAdLoadListener appLovinAdLoadListener, q7 q7Var, int i10, com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
        }
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i10);
        }
        Set setA = a(p7Var, kVar);
        if (CollectionUtils.isEmpty(setA)) {
            return;
        }
        a(setA, q7Var, kVar);
    }

    public static boolean b(l7 l7Var) {
        y7 y7VarB1;
        List listG;
        return (l7Var == null || (y7VarB1 = l7Var.B1()) == null || (listG = y7VarB1.g()) == null || listG.isEmpty()) ? false : true;
    }

    public static q7 c(l7 l7Var) {
        if (b(l7Var) || a(l7Var)) {
            return null;
        }
        return q7.GENERAL_WRAPPER_ERROR;
    }

    private static String b() {
        DateFormat dateFormat = f16211a;
        dateFormat.setTimeZone(TimeZone.getDefault());
        return dateFormat.format(new Date());
    }

    public static boolean a(l7 l7Var) {
        o7 o7VarS1;
        t7 t7VarE;
        if (l7Var == null || (o7VarS1 = l7Var.s1()) == null || (t7VarE = o7VarS1.e()) == null) {
            return false;
        }
        return t7VarE.c() != null || StringUtils.isValidString(t7VarE.b());
    }

    public static boolean b(m8 m8Var) {
        if (m8Var != null) {
            return m8Var.b("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    public static Uri a(String str, long j10, Uri uri, q7 q7Var, com.applovin.impl.sdk.k kVar) {
        if (URLUtil.isValidUrl(str)) {
            try {
                String string = Integer.toString(q7Var.b());
                String strReplace = str.replace("[ERRORCODE]", string).replace("[REASON]", string);
                if (j10 >= 0) {
                    strReplace = strReplace.replace("[CONTENTPLAYHEAD]", a(j10));
                }
                if (uri != null) {
                    strReplace = strReplace.replace("[ASSETURI]", uri.toString());
                }
                return Uri.parse(strReplace.replace("[CACHEBUSTING]", a()).replace("[TIMESTAMP]", b()));
            } catch (Throwable th2) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastUtils", DwaEpyvxz.Jdkl + str, th2);
                }
                kVar.E().a("VastUtils", th2);
                return null;
            }
        }
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().b("VastUtils", "Unable to replace macros in invalid URL string.");
        }
        return null;
    }

    private static String a(long j10) {
        if (j10 > 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long hours = timeUnit.toHours(j10);
            long minutes = timeUnit.toMinutes(j10);
            TimeUnit timeUnit2 = TimeUnit.MINUTES;
            return String.format(Locale.US, "%02d:%02d:%02d.000", Long.valueOf(hours), Long.valueOf(minutes % timeUnit2.toSeconds(1L)), Long.valueOf(j10 % timeUnit2.toSeconds(1L)));
        }
        return "00:00:00.000";
    }

    private static String a() {
        return Integer.toString(f16212b.nextInt(89999999) + 10000000);
    }

    public static void a(Set set, com.applovin.impl.sdk.k kVar) {
        a(set, -1L, (Uri) null, q7.UNSPECIFIED, kVar);
    }

    public static void a(Set set, q7 q7Var, com.applovin.impl.sdk.k kVar) {
        a(set, -1L, (Uri) null, q7Var, kVar);
    }

    public static void a(Set set, long j10, Uri uri, q7 q7Var, com.applovin.impl.sdk.k kVar) {
        if (kVar != null) {
            if (set == null || set.isEmpty()) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                v7 v7Var = (v7) it.next();
                long j11 = j10;
                Uri uri2 = uri;
                q7 q7Var2 = q7Var;
                com.applovin.impl.sdk.k kVar2 = kVar;
                Uri uriA = a(v7Var.c(), j11, uri2, q7Var2, kVar2);
                if (uriA != null) {
                    kVar2.f0().a(com.applovin.impl.sdk.network.d.b().d(uriA.toString()).a(false).b(v7Var.d()).a(), false);
                }
                j10 = j11;
                uri = uri2;
                q7Var = q7Var2;
                kVar = kVar2;
            }
            return;
        }
        throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
    }

    public static void a(m8 m8Var, Map map, p7 p7Var, com.applovin.impl.sdk.k kVar) {
        List<m8> listA;
        if (kVar == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (m8Var == null) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("VastUtils", "Unable to render event trackers; null node provided");
                return;
            }
            return;
        }
        if (map == null) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("VastUtils", "Unable to render event trackers; null event trackers provided");
                return;
            }
            return;
        }
        m8 m8VarC = m8Var.c("TrackingEvents");
        if (m8VarC == null || (listA = m8VarC.a("Tracking")) == null) {
            return;
        }
        for (m8 m8Var2 : listA) {
            String str = (String) m8Var2.a().get(NotificationCompat.CATEGORY_EVENT);
            if (StringUtils.isValidString(str)) {
                v7 v7VarA = v7.a(m8Var2, p7Var, kVar);
                if (v7VarA != null) {
                    Set set = (Set) map.get(str);
                    if (set != null) {
                        set.add(v7VarA);
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.add(v7VarA);
                        map.put(str, hashSet);
                    }
                }
            } else {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().b("VastUtils", "Could not find event for tracking node = " + m8Var2);
                }
            }
        }
    }

    public static void a(List list, Set set, p7 p7Var, com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("VastUtils", "Unable to render trackers; null nodes provided");
                return;
            }
            return;
        }
        if (set == null) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("VastUtils", "Unable to render trackers; null trackers provided");
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v7 v7VarA = v7.a((m8) it.next(), p7Var, kVar);
            if (v7VarA != null) {
                set.add(v7VarA);
            }
        }
    }

    public static boolean a(m8 m8Var) {
        if (m8Var != null) {
            return m8Var.b("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    public static String a(p7 p7Var) {
        m8 m8VarB;
        if (p7Var != null) {
            List listA = p7Var.a();
            int size = p7Var.a().size();
            if (size <= 0 || (m8VarB = ((m8) listA.get(size - 1)).b("VASTAdTagURI")) == null) {
                return null;
            }
            return m8VarB.d();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    public static String a(m8 m8Var, String str, String str2) {
        m8 m8VarC = m8Var.c(str);
        if (m8VarC != null) {
            String strD = m8VarC.d();
            if (StringUtils.isValidString(strD)) {
                return strD;
            }
        }
        return str2;
    }

    private static Set a(p7 p7Var, com.applovin.impl.sdk.k kVar) {
        List listA;
        if (p7Var == null) {
            return null;
        }
        List<m8> listA2 = p7Var.a();
        HashSet hashSet = new HashSet(listA2.size());
        for (m8 m8Var : listA2) {
            m8 m8VarB = m8Var.b("Wrapper");
            if (m8VarB == null) {
                m8VarB = m8Var.b("InLine");
            }
            if (m8VarB != null) {
                listA = m8VarB.a("Error");
            } else {
                listA = m8Var.a("Error");
            }
            hashSet = a(hashSet, listA, p7Var, kVar);
        }
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().a("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        }
        return hashSet;
    }

    private static HashSet a(HashSet hashSet, List list, p7 p7Var, com.applovin.impl.sdk.k kVar) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                v7 v7VarA = v7.a((m8) it.next(), p7Var, kVar);
                if (v7VarA != null) {
                    hashSet.add(v7VarA);
                }
            }
        }
        return hashSet;
    }
}
