package ba;

import com.ironsource.Q6;
import u5.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8987c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8988e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f8989f;

    public /* synthetic */ e(String str, int i10, String str2, int i11) {
        this.f8986b = i11;
        this.f8987c = str;
        this.f8988e = i10;
        this.f8989f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kv.l
    public final Object invoke(Object obj) {
        x5.d dVarPrepare;
        switch (this.f8986b) {
            case 0:
                int i10 = this.f8988e;
                dVarPrepare = ((x5.b) obj).prepare("SELECT * FROM AccountAwards WHERE lang = ? AND theme_id = ? AND id = ?");
                String str = this.f8987c;
                try {
                    if (str == null) {
                        dVarPrepare.bindNull(1);
                    } else {
                        dVarPrepare.bindText(1, str);
                    }
                    dVarPrepare.bindLong(2, i10);
                    String str2 = this.f8989f;
                    if (str2 == null) {
                        dVarPrepare.bindNull(3);
                    } else {
                        dVarPrepare.bindText(3, str2);
                    }
                    int columnIndexOrThrow = s.getColumnIndexOrThrow(dVarPrepare, "id");
                    int columnIndexOrThrow2 = s.getColumnIndexOrThrow(dVarPrepare, "name");
                    int columnIndexOrThrow3 = s.getColumnIndexOrThrow(dVarPrepare, "type");
                    int columnIndexOrThrow4 = s.getColumnIndexOrThrow(dVarPrepare, "theme_id");
                    int columnIndexOrThrow5 = s.getColumnIndexOrThrow(dVarPrepare, Q6.f35290q);
                    int columnIndexOrThrow6 = s.getColumnIndexOrThrow(dVarPrepare, "description");
                    String text = null;
                    if (dVarPrepare.step()) {
                        a aVar = new a();
                        aVar.setId(dVarPrepare.isNull(columnIndexOrThrow) ? null : dVarPrepare.getText(columnIndexOrThrow));
                        aVar.setName(dVarPrepare.isNull(columnIndexOrThrow2) ? null : dVarPrepare.getText(columnIndexOrThrow2));
                        aVar.setType(dVarPrepare.isNull(columnIndexOrThrow3) ? null : dVarPrepare.getText(columnIndexOrThrow3));
                        aVar.setThemeId(dVarPrepare.isNull(columnIndexOrThrow4) ? null : dVarPrepare.getText(columnIndexOrThrow4));
                        aVar.setLang(dVarPrepare.isNull(columnIndexOrThrow5) ? null : dVarPrepare.getText(columnIndexOrThrow5));
                        if (!dVarPrepare.isNull(columnIndexOrThrow6)) {
                            text = dVarPrepare.getText(columnIndexOrThrow6);
                        }
                        aVar.setDescription(text);
                        text = aVar;
                    }
                    dVarPrepare.close();
                    return text;
                } finally {
                    dVarPrepare.close();
                }
            case 1:
                int i11 = this.f8988e;
                x5.d dVarPrepare2 = ((x5.b) obj).prepare("SELECT nb FROM AccountNbAwards WHERE lang = ? AND theme_id = ? AND type_award = ?");
                String str3 = this.f8987c;
                try {
                    if (str3 == null) {
                        dVarPrepare2.bindNull(1);
                    } else {
                        dVarPrepare2.bindText(1, str3);
                    }
                    dVarPrepare2.bindLong(2, i11);
                    String str4 = this.f8989f;
                    if (str4 == null) {
                        dVarPrepare2.bindNull(3);
                    } else {
                        dVarPrepare2.bindText(3, str4);
                    }
                    Integer numValueOf = Integer.valueOf(dVarPrepare2.step() ? (int) dVarPrepare2.getLong(0) : 0);
                    dVarPrepare2.close();
                    return numValueOf;
                } finally {
                }
            default:
                int i12 = this.f8988e;
                dVarPrepare = ((x5.b) obj).prepare("SELECT COUNT(*) FROM AccountAwards WHERE type = ? AND theme_id = ? AND lang = ?");
                String str5 = this.f8987c;
                try {
                    if (str5 == null) {
                        dVarPrepare.bindNull(1);
                    } else {
                        dVarPrepare.bindText(1, str5);
                    }
                    dVarPrepare.bindLong(2, i12);
                    String str6 = this.f8989f;
                    if (str6 == null) {
                        dVarPrepare.bindNull(3);
                    } else {
                        dVarPrepare.bindText(3, str6);
                    }
                    Integer numValueOf2 = Integer.valueOf(dVarPrepare.step() ? (int) dVarPrepare.getLong(0) : 0);
                    dVarPrepare.close();
                    return numValueOf2;
                } finally {
                }
        }
    }
}
