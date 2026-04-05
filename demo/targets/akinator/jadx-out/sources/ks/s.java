package ks;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import bf.m1;
import br.h0;
import com.amazon.device.ads.DtbConstants;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.google.android.exoplayer2.l2;
import com.google.android.exoplayer2.n2;
import com.google.android.exoplayer2.r2;
import com.google.android.exoplayer2.util.a0;
import com.google.android.exoplayer2.util.b0;
import com.google.android.gms.tasks.Task;
import gn.a2;
import gn.b2;
import gn.c1;
import gn.e1;
import gn.i1;
import gn.k2;
import gn.u0;
import gn.v;
import io.bidmachine.media3.common.util.x;
import io.odeeo.internal.b.k0;
import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import lb.b1;
import md.d0;
import md.u;
import mt.p0;
import mt.r0;
import mt.w;
import n6.t;
import nh.we;
import on.c0;
import p0.o2;
import pf.c;
import s9.c;
import timber.log.Timber;
import tu.x0;
import zd.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class s implements o.a, w2.l, w, rr.b, io.bidmachine.media3.common.util.w, x, pf.h, ir.d, r0, wd.b, vd.n, ProductDetailsResponseListener, a0, b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f72014b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f72015c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f72016e;

    public /* synthetic */ s(int i10, Object obj, Object obj2) {
        this.f72014b = i10;
        this.f72015c = obj;
        this.f72016e = obj2;
    }

    @Override // vd.n
    public Object apply(Object obj) {
        vd.p pVar = (vd.p) this.f72015c;
        d0 d0Var = (d0) this.f72016e;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        vd.a aVar = (vd.a) pVar.f89221f;
        ArrayList arrayListK = pVar.k(sQLiteDatabase, d0Var, aVar.f89203c);
        for (jd.h hVar : jd.h.values()) {
            if (hVar != d0Var.getPriority()) {
                int size = aVar.f89203c - arrayListK.size();
                if (size <= 0) {
                    break;
                }
                arrayListK.addAll(pVar.k(sQLiteDatabase, d0Var.withPriority(hVar), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < arrayListK.size(); i10++) {
            sb2.append(((vd.m) arrayListK.get(i10)).getId());
            if (i10 < arrayListK.size() - 1) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
        }
        sb2.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        try {
            Cursor cursor = cursorQuery;
            while (cursor.moveToNext()) {
                long j10 = cursor.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j10));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j10), hashSet);
                }
                hashSet.add(new vd.o(cursor.getString(1), cursor.getString(2)));
            }
            cursorQuery.close();
            ListIterator listIterator = arrayListK.listIterator();
            while (listIterator.hasNext()) {
                vd.m mVar = (vd.m) listIterator.next();
                if (map.containsKey(Long.valueOf(mVar.getId()))) {
                    u.a builder = mVar.getEvent().toBuilder();
                    for (vd.o oVar : (Set) map.get(Long.valueOf(mVar.getId()))) {
                        builder.addMetadata(oVar.f89215a, oVar.f89216b);
                    }
                    listIterator.set(vd.m.create(mVar.getId(), mVar.getTransportContext(), builder.build()));
                }
            }
            return arrayListK;
        } catch (Throwable th2) {
            cursorQuery.close();
            throw th2;
        }
    }

    @Override // w2.l
    public Object attachCompleter(w2.j it) {
        Executor executor = (Executor) this.f72015c;
        kv.a aVar = (kv.a) this.f72016e;
        e0.checkNotNullParameter(it, "it");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        it.addCancellationListener(new t(atomicBoolean, 1), n6.l.f75753b);
        executor.execute(new n6.u(atomicBoolean, it, aVar, 1));
        return x0.f87415a;
    }

    @Override // pf.h
    public List create(int i10, m1 m1Var, int[] iArr) {
        int i11 = this.f72014b;
        Object obj = this.f72016e;
        pf.e eVar = (pf.e) this.f72015c;
        switch (i11) {
            case 16:
                we weVar = pf.c.f81029k;
                return c.g.createForTrackGroup(i10, m1Var, eVar, iArr, ((int[]) obj)[i10]);
            default:
                we weVar2 = pf.c.f81029k;
                return c.e.createForTrackGroup(i10, m1Var, eVar, iArr, (String) obj);
        }
    }

    @Override // ir.d
    public void execute(Object obj) {
        ((pq.e) this.f72015c).f81631d.a((pq.i) this.f72016e, (h0) obj);
    }

    @Override // rr.b
    public Object get() {
        om.e eVar = (om.e) this.f72015c;
        return String.format("%s (%s) - Header bidding collect fail - %s", eVar.f79554e, eVar.f79555f, (pr.a) this.f72016e);
    }

    @Override // io.bidmachine.media3.common.util.x
    public void invoke(Object obj, v vVar) throws NumberFormatException {
        c0 c0Var = (c0) ((on.d) obj);
        c0Var.onEvents((i1) this.f72016e, new on.c(vVar, ((on.x) this.f72015c).f79690g));
    }

    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public void onProductDetailsResponse(BillingResult billingResult, List list) {
        z9.l lVar = (z9.l) this.f72015c;
        z9.b bVar = (z9.b) this.f72016e;
        lVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            Timber.tag("AkInappManagerImpl").e("get products details failed (" + String.valueOf(billingResult.getResponseCode()) + " : " + billingResult.getDebugMessage(), new Object[0]);
            if (bVar != null) {
                bVar.onInappDetailsUpdate(false);
            }
        }
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        TreeMap treeMap3 = new TreeMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProductDetails productDetails = (ProductDetails) it.next();
            treeMap.put(productDetails.getProductId(), productDetails.getOneTimePurchaseOfferDetails().getFormattedPrice());
            treeMap2.put(productDetails.getProductId(), productDetails.getTitle());
            treeMap3.put(productDetails.getProductId(), productDetails.getDescription());
            lVar.f97730c.put(productDetails.getProductId(), productDetails);
        }
        if (treeMap2.get("com.elokence.akinator.freemium.packads") != null) {
            z9.e.getInstance().f97701b = ((String) treeMap2.get("com.elokence.akinator.freemium.packads")).replace("(Akinator the Genie FREE)", "");
            z9.e.getInstance().f97702c = (String) treeMap3.get("com.elokence.akinator.freemium.packads");
            z9.e.getInstance().f97703d = (String) treeMap.get("com.elokence.akinator.freemium.packads");
        }
        if (treeMap2.get("com.elokence.akinator.freemium.packcharacters") != null) {
            z9.e.getInstance().f97704e = ((String) treeMap2.get("com.elokence.akinator.freemium.packcharacters")).replace("(Akinator the Genie FREE)", "");
            z9.e.getInstance().f97705f = (String) treeMap3.get("com.elokence.akinator.freemium.packcharacters");
            z9.e.getInstance().f97706g = (String) treeMap.get("com.elokence.akinator.freemium.packcharacters");
        }
        if (treeMap2.get("com.digidust.elokence.akinator.freemium.full") != null) {
            z9.e.getInstance().f97707h = ((String) treeMap2.get("com.digidust.elokence.akinator.freemium.full")).replace("(Akinator the Genie FREE)", "");
            z9.e.getInstance().f97708i = (String) treeMap3.get("com.digidust.elokence.akinator.freemium.full");
            z9.e.getInstance().f97709j = (String) treeMap.get("com.digidust.elokence.akinator.freemium.full");
        }
        int i10 = 0;
        while (true) {
            String[] strArr = lVar.f97731d;
            if (i10 >= strArr.length) {
                z9.e eVar = z9.e.getInstance();
                synchronized (eVar.f97700a) {
                    try {
                        Timber.tag("AkInappManager").w("Signal update sku", new Object[0]);
                        Iterator it2 = eVar.f97700a.iterator();
                        while (it2.hasNext()) {
                            ((z9.a) it2.next()).skuDetailsUpdated();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (bVar != null) {
                    bVar.onInappDetailsUpdate(true);
                    return;
                }
                return;
            }
            if (treeMap2.get(strArr[i10]) != null) {
                z9.e.getInstance().f97710k[i10] = ((String) treeMap2.get(lVar.f97731d[i10])).replace("(Akinator the Genie FREE)", "").replace("(Akinator the Genie)", "");
                Timber.Tree treeTag = Timber.tag("AkInappManagerImpl");
                StringBuilder sbT = o2.t(i10, "nomsInappGeniz ", " : ");
                sbT.append(z9.e.getInstance().f97710k[i10]);
                treeTag.d(sbT.toString(), new Object[0]);
                z9.e.getInstance().f97712m[i10] = (String) treeMap3.get(lVar.f97731d[i10]);
                z9.e.getInstance().f97711l[i10] = (String) treeMap.get(lVar.f97731d[i10]);
                String str = z9.e.getInstance().f97710k[i10];
                z9.e.getInstance().f97713n[i10] = 0;
                String str2 = lVar.f97731d[i10];
                switch (str2.charAt(str2.length() - 1)) {
                    case '1':
                        z9.e.getInstance().f97713n[i10] = 45000;
                        break;
                    case '2':
                        z9.e.getInstance().f97713n[i10] = 115000;
                        break;
                    case '3':
                        z9.e.getInstance().f97713n[i10] = 195000;
                        break;
                    case '4':
                        z9.e.getInstance().f97713n[i10] = 305000;
                        break;
                    case '5':
                        z9.e.getInstance().f97713n[i10] = 460000;
                        break;
                }
            }
            i10++;
        }
    }

    @Override // mt.r0
    public void subscribe(p0 emitter) {
        Bitmap bitmapCreateScaledBitmap;
        s9.c cVar = (s9.c) this.f72015c;
        Uri uri = (Uri) this.f72016e;
        c.a aVar = s9.c.f85509j;
        e0.checkNotNullParameter(emitter, "emitter");
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(cVar.requireActivity().getContentResolver().openInputStream(uri));
        if (bitmapDecodeStream.getHeight() == bitmapDecodeStream.getWidth()) {
            e0.checkNotNull(bitmapDecodeStream);
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeStream, 500, 500, true);
        } else if (bitmapDecodeStream.getHeight() > bitmapDecodeStream.getWidth()) {
            e0.checkNotNull(bitmapDecodeStream);
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeStream, DtbConstants.DEFAULT_PLAYER_HEIGHT, (bitmapDecodeStream.getHeight() * DtbConstants.DEFAULT_PLAYER_HEIGHT) / bitmapDecodeStream.getWidth(), true);
        } else {
            e0.checkNotNull(bitmapDecodeStream);
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeStream, 640, (bitmapDecodeStream.getHeight() * 640) / bitmapDecodeStream.getWidth(), true);
        }
        cVar.f85512f = bitmapCreateScaledBitmap;
        if (!e0.areEqual(bitmapCreateScaledBitmap, bitmapDecodeStream) && !bitmapDecodeStream.isRecycled()) {
            bitmapDecodeStream.recycle();
        }
        Bitmap bitmap = cVar.f85512f;
        if (bitmap != null) {
            ((du.g) emitter).onSuccess(bitmap);
        } else {
            ((du.g) emitter).onError(new NullPointerException(b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD")));
        }
    }

    @Override // wd.b
    public Object execute() {
        switch (this.f72014b) {
            case 20:
                ((vd.p) ((ud.h) this.f72015c).f88429c).recordSuccess((Iterable) this.f72016e);
                break;
            default:
                ud.h hVar = (ud.h) this.f72015c;
                for (Map.Entry entry : ((HashMap) this.f72016e).entrySet()) {
                    ((vd.p) hVar.f88435i).recordLogEventDropped(((Integer) entry.getValue()).intValue(), qd.f.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.util.b0
    public void invoke(Object obj, com.google.android.exoplayer2.util.p pVar) {
        z zVar = (z) ((zd.d) obj);
        zVar.onEvents((r2) this.f72016e, new zd.c(pVar, ((zd.v) this.f72015c).f97875g));
    }

    @Override // io.odeeo.internal.q0.o.a
    public void invoke(Object obj) {
        switch (this.f72014b) {
            case 0:
                ((io.odeeo.internal.c.b) obj).onPlaybackParametersChanged((b.a) this.f72015c, (k0) this.f72016e);
                break;
            case 1:
                ((io.odeeo.internal.c.b) obj).onMetadata((b.a) this.f72015c, (io.odeeo.internal.s.a) this.f72016e);
                break;
            case 2:
            case 3:
            case 4:
            case 7:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 26:
            default:
                ((z) ((zd.d) obj)).onTrackSelectionParametersChanged((zd.b) this.f72015c, (pf.s) this.f72016e);
                break;
            case 5:
                ((c0) ((on.d) obj)).onCues((on.b) this.f72015c, (in.d) this.f72016e);
                break;
            case 6:
                on.b bVar = (on.b) this.f72015c;
                k2 k2Var = (k2) this.f72016e;
                c0 c0Var = (c0) ((on.d) obj);
                c0Var.onVideoSizeChanged(bVar, k2Var);
                c0Var.onVideoSizeChanged(bVar, k2Var.f57981a, k2Var.f57982b, 0, k2Var.f57983c);
                break;
            case 8:
                ((c0) ((on.d) obj)).onPlaybackParametersChanged((on.b) this.f72015c, (c1) this.f72016e);
                break;
            case 9:
                ((c0) ((on.d) obj)).onTracksChanged((on.b) this.f72015c, (b2) this.f72016e);
                break;
            case 10:
                ((c0) ((on.d) obj)).onMetadata((on.b) this.f72015c, (u0) this.f72016e);
                break;
            case 11:
                ((c0) ((on.d) obj)).onDeviceInfoChanged((on.b) this.f72015c, (gn.q) this.f72016e);
                break;
            case 12:
                ((c0) ((on.d) obj)).onTrackSelectionParametersChanged((on.b) this.f72015c, (a2) this.f72016e);
                break;
            case 13:
                ((c0) ((on.d) obj)).onAudioAttributesChanged((on.b) this.f72015c, (gn.h) this.f72016e);
                break;
            case 14:
                ((c0) ((on.d) obj)).onCues((on.b) this.f72015c, (List) this.f72016e);
                break;
            case 15:
                ((c0) ((on.d) obj)).onAvailableCommandsChanged((on.b) this.f72015c, (e1) this.f72016e);
                break;
            case 24:
                ((z) ((zd.d) obj)).onAudioAttributesChanged((zd.b) this.f72015c, (com.google.android.exoplayer2.audio.k) this.f72016e);
                break;
            case 25:
                ((z) ((zd.d) obj)).onPlaybackParametersChanged((zd.b) this.f72015c, (l2) this.f72016e);
                break;
            case 27:
                ((z) ((zd.d) obj)).onCues((zd.b) this.f72015c, (ef.e) this.f72016e);
                break;
            case 28:
                ((z) ((zd.d) obj)).onAvailableCommandsChanged((zd.b) this.f72015c, (n2) this.f72016e);
                break;
        }
    }

    @Override // mt.w
    public void subscribe(mt.u uVar) {
        Task task = (Task) this.f72015c;
        Executor executor = (Executor) this.f72016e;
        task.addOnSuccessListener(executor, new nj.e0(uVar));
        task.addOnFailureListener(executor, new nj.e0(uVar));
    }
}
