package com.bykv.vk.openvk.jpo.jpo.jd.jpo.jd;

import android.content.Context;
import com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {
    public static final ConcurrentHashMap<String, jd> jpo = new ConcurrentHashMap<>();

    public static synchronized void jpo(Context context, com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar, jpo.InterfaceC0054jpo interfaceC0054jpo) {
        if (wqxVar == null) {
            return;
        }
        try {
            ConcurrentHashMap<String, jd> concurrentHashMap = jpo;
            jd jdVar = concurrentHashMap.get(wqxVar.sq());
            if (jdVar == null) {
                jdVar = new jd(context, wqxVar);
                concurrentHashMap.put(wqxVar.sq(), jdVar);
                wqxVar.jj();
                wqxVar.sq();
            }
            jdVar.jpo(interfaceC0054jpo);
            wqxVar.jj();
            wqxVar.sq();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar) {
        try {
            jd jdVarRemove = jpo.remove(wqxVar.sq());
            if (jdVarRemove != null) {
                jdVarRemove.jpo(true);
            }
            wqxVar.jj();
            wqxVar.sq();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
