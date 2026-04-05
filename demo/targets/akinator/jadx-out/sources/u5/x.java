package u5;

import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import sv.n0;
import u5.z;
import uu.b2;
import uu.o0;
import uu.q0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f87939a = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    public static final List a(x5.d dVar) {
        int iColumnIndexOf = s.columnIndexOf(dVar, "id");
        int iColumnIndexOf2 = s.columnIndexOf(dVar, "seq");
        int iColumnIndexOf3 = s.columnIndexOf(dVar, "from");
        int iColumnIndexOf4 = s.columnIndexOf(dVar, "to");
        List listCreateListBuilder = o0.createListBuilder();
        while (dVar.step()) {
            listCreateListBuilder.add(new k((int) dVar.getLong(iColumnIndexOf), (int) dVar.getLong(iColumnIndexOf2), dVar.getText(iColumnIndexOf3), dVar.getText(iColumnIndexOf4)));
        }
        return y0.sorted(o0.build(listCreateListBuilder));
    }

    public static final z.d b(x5.b bVar, String str, boolean z10) throws Exception {
        x5.d dVarPrepare = bVar.prepare("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iColumnIndexOf = s.columnIndexOf(dVarPrepare, "seqno");
            int iColumnIndexOf2 = s.columnIndexOf(dVarPrepare, BidResponsedEx.KEY_CID);
            int iColumnIndexOf3 = s.columnIndexOf(dVarPrepare, "name");
            int iColumnIndexOf4 = s.columnIndexOf(dVarPrepare, CampaignEx.JSON_KEY_DESC);
            if (iColumnIndexOf != -1 && iColumnIndexOf2 != -1 && iColumnIndexOf3 != -1 && iColumnIndexOf4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (dVarPrepare.step()) {
                    if (((int) dVarPrepare.getLong(iColumnIndexOf2)) >= 0) {
                        int i10 = (int) dVarPrepare.getLong(iColumnIndexOf);
                        String text = dVarPrepare.getText(iColumnIndexOf3);
                        String str2 = dVarPrepare.getLong(iColumnIndexOf4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i10), text);
                        linkedHashMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                List listSortedWith = y0.sortedWith(linkedHashMap.entrySet(), new v());
                ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(listSortedWith, 10));
                Iterator it = listSortedWith.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List list = y0.toList(arrayList);
                List listSortedWith2 = y0.sortedWith(linkedHashMap2.entrySet(), new w());
                ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(listSortedWith2, 10));
                Iterator it2 = listSortedWith2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                z.d dVar = new z.d(str, z10, list, y0.toList(arrayList2));
                iv.a.closeFinally(dVarPrepare, null);
                return dVar;
            }
            iv.a.closeFinally(dVarPrepare, null);
            return null;
        } finally {
        }
    }

    public static final int findAffinity(String str) {
        if (str == null) {
            return 5;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        e0.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (n0.contains$default((CharSequence) upperCase, (CharSequence) PtLatqAYjEFT.iBWsuehk, false, 2, (Object) null)) {
            return 3;
        }
        if (n0.contains$default((CharSequence) upperCase, (CharSequence) "CHAR", false, 2, (Object) null) || n0.contains$default((CharSequence) upperCase, (CharSequence) "CLOB", false, 2, (Object) null) || n0.contains$default((CharSequence) upperCase, (CharSequence) "TEXT", false, 2, (Object) null)) {
            return 2;
        }
        if (n0.contains$default((CharSequence) upperCase, (CharSequence) "BLOB", false, 2, (Object) null)) {
            return 5;
        }
        return (n0.contains$default((CharSequence) upperCase, (CharSequence) "REAL", false, 2, (Object) null) || n0.contains$default((CharSequence) upperCase, (CharSequence) "FLOA", false, 2, (Object) null) || n0.contains$default((CharSequence) upperCase, (CharSequence) "DOUB", false, 2, (Object) null)) ? 4 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Set<java.lang.String> parseFtsOptions(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.x.parseFtsOptions(java.lang.String):java.util.Set");
    }

    public static final Set<String> readFtsColumns(x5.b connection, String tableName) throws Exception {
        e0.checkNotNullParameter(connection, "connection");
        e0.checkNotNullParameter(tableName, "tableName");
        Set setCreateSetBuilder = b2.createSetBuilder();
        x5.d dVarPrepare = connection.prepare("PRAGMA table_info(`" + tableName + "`)");
        try {
            if (dVarPrepare.step()) {
                int iColumnIndexOf = s.columnIndexOf(dVarPrepare, "name");
                do {
                    setCreateSetBuilder.add(dVarPrepare.getText(iColumnIndexOf));
                } while (dVarPrepare.step());
            }
            iv.a.closeFinally(dVarPrepare, null);
            return b2.build(setCreateSetBuilder);
        } finally {
        }
    }

    public static final Set<String> readFtsOptions(x5.b connection, String tableName) throws Exception {
        e0.checkNotNullParameter(connection, "connection");
        e0.checkNotNullParameter(tableName, "tableName");
        x5.d dVarPrepare = connection.prepare("SELECT * FROM sqlite_master WHERE `name` = '" + tableName + '\'');
        try {
            String text = dVarPrepare.step() ? dVarPrepare.getText(s.columnIndexOf(dVarPrepare, "sql")) : "";
            iv.a.closeFinally(dVarPrepare, null);
            return parseFtsOptions(text);
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ea, code lost:
    
        r0 = uu.b2.build(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ee, code lost:
    
        iv.a.closeFinally(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final u5.z readTableInfo(x5.b r30, java.lang.String r31) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.x.readTableInfo(x5.b, java.lang.String):u5.z");
    }

    public static final b0 readViewInfo(x5.b connection, String viewName) throws Exception {
        e0.checkNotNullParameter(connection, "connection");
        e0.checkNotNullParameter(viewName, "viewName");
        x5.d dVarPrepare = connection.prepare("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + viewName + '\'');
        try {
            b0 b0Var = dVarPrepare.step() ? new b0(dVarPrepare.getText(0), dVarPrepare.getText(1)) : new b0(viewName, null);
            iv.a.closeFinally(dVarPrepare, null);
            return b0Var;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                iv.a.closeFinally(dVarPrepare, th2);
                throw th3;
            }
        }
    }
}
