package q8;

import android.graphics.Bitmap;
import android.os.Build;
import com.ironsource.C3191e4;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class s implements p {

    /* renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f82598d;

    /* renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f82599e;

    /* renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f82600f;

    /* renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f82601g;

    /* renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f82602h;

    /* renamed from: a, reason: collision with root package name */
    public final t f82603a = new t();

    /* renamed from: b, reason: collision with root package name */
    public final h f82604b = new h();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f82605c = new HashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        public final t f82606a;

        /* renamed from: b, reason: collision with root package name */
        public int f82607b;

        /* renamed from: c, reason: collision with root package name */
        public Bitmap.Config f82608c;

        public a(t tVar) {
            this.f82606a = tVar;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f82607b == aVar.f82607b && j9.s.bothNullOrEqual(this.f82608c, aVar.f82608c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f82607b * 31;
            Bitmap.Config config = this.f82608c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public void init(int i10, Bitmap.Config config) {
            this.f82607b = i10;
            this.f82608c = config;
        }

        @Override // q8.q
        public void offer() {
            this.f82606a.offer(this);
        }

        public String toString() {
            return s.b(this.f82607b, this.f82608c);
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f82598d = configArr;
        f82599e = configArr;
        f82600f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f82601g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f82602h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String b(int i10, Bitmap.Config config) {
        return C3191e4.i.f36529d + i10 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapC = c(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapC.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapC.remove(num);
                return;
            } else {
                navigableMapC.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + logBitmap(bitmap) + ", this: " + this);
    }

    public final NavigableMap c(Bitmap.Config config) {
        HashMap map = this.f82605c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    @Override // q8.p
    public Bitmap get(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int bitmapByteSize = j9.s.getBitmapByteSize(i10, i11, config);
        t tVar = this.f82603a;
        a aVar = tVar.get(bitmapByteSize, config);
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i12 = r.f82597a[config.ordinal()];
            configArr = i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? new Bitmap.Config[]{config} : f82602h : f82601g : f82600f : f82598d;
        } else {
            configArr = f82599e;
        }
        int length = configArr.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i13];
            Integer num = (Integer) c(config2).ceilingKey(Integer.valueOf(bitmapByteSize));
            if (num == null || num.intValue() > bitmapByteSize * 8) {
                i13++;
            } else if (num.intValue() != bitmapByteSize || (config2 != null ? !config2.equals(config) : config != null)) {
                tVar.offer(aVar);
                aVar = tVar.get(num.intValue(), config2);
            }
        }
        Bitmap bitmap = (Bitmap) this.f82604b.get(aVar);
        if (bitmap != null) {
            a(Integer.valueOf(aVar.f82607b), bitmap);
            bitmap.reconfigure(i10, i11, config);
        }
        return bitmap;
    }

    @Override // q8.p
    public int getSize(Bitmap bitmap) {
        return j9.s.getBitmapByteSize(bitmap);
    }

    @Override // q8.p
    public String logBitmap(Bitmap bitmap) {
        return b(j9.s.getBitmapByteSize(bitmap), bitmap.getConfig());
    }

    @Override // q8.p
    public void put(Bitmap bitmap) {
        a aVar = this.f82603a.get(j9.s.getBitmapByteSize(bitmap), bitmap.getConfig());
        this.f82604b.put(aVar, bitmap);
        NavigableMap navigableMapC = c(bitmap.getConfig());
        Integer num = (Integer) navigableMapC.get(Integer.valueOf(aVar.f82607b));
        navigableMapC.put(Integer.valueOf(aVar.f82607b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // q8.p
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f82604b.removeLast();
        if (bitmap != null) {
            a(Integer.valueOf(j9.s.getBitmapByteSize(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sbU = o2.u("SizeConfigStrategy{groupedMap=");
        sbU.append(this.f82604b);
        sbU.append(", sortedSizes=(");
        HashMap map = this.f82605c;
        for (Map.Entry entry : map.entrySet()) {
            sbU.append(entry.getKey());
            sbU.append(AbstractJsonLexerKt.BEGIN_LIST);
            sbU.append(entry.getValue());
            sbU.append("], ");
        }
        if (!map.isEmpty()) {
            sbU.replace(sbU.length() - 2, sbU.length(), "");
        }
        sbU.append(")}");
        return sbU.toString();
    }

    @Override // q8.p
    public String logBitmap(int i10, int i11, Bitmap.Config config) {
        return b(j9.s.getBitmapByteSize(i10, i11, config), config);
    }
}
