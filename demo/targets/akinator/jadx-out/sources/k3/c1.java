package k3;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import com.ironsource.C3191e4;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f70136a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f70137b;

    /* renamed from: c, reason: collision with root package name */
    public String f70138c;

    /* renamed from: d, reason: collision with root package name */
    public String f70139d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f70140e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f70141f;

    public static c1 fromAndroidPerson(Person person) {
        return e4.q.c(person);
    }

    public static c1 fromBundle(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new b1().setName(bundle.getCharSequence("name")).setIcon(bundle2 != null ? IconCompat.createFromBundle(bundle2) : null).setUri(bundle.getString("uri")).setKey(bundle.getString(C3191e4.h.W)).setBot(bundle.getBoolean("isBot")).setImportant(bundle.getBoolean("isImportant")).build();
    }

    public static c1 fromPersistableBundle(PersistableBundle persistableBundle) {
        return new b1().setName(persistableBundle.getString("name")).setUri(persistableBundle.getString("uri")).setKey(persistableBundle.getString(C3191e4.h.W)).setBot(persistableBundle.getBoolean("isBot")).setImportant(persistableBundle.getBoolean("isImportant")).build();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        String key = getKey();
        String key2 = c1Var.getKey();
        return (key == null && key2 == null) ? Objects.equals(Objects.toString(getName()), Objects.toString(c1Var.getName())) && Objects.equals(getUri(), c1Var.getUri()) && Boolean.valueOf(isBot()).equals(Boolean.valueOf(c1Var.isBot())) && Boolean.valueOf(isImportant()).equals(Boolean.valueOf(c1Var.isImportant())) : Objects.equals(key, key2);
    }

    public IconCompat getIcon() {
        return this.f70137b;
    }

    public String getKey() {
        return this.f70139d;
    }

    public CharSequence getName() {
        return this.f70136a;
    }

    public String getUri() {
        return this.f70138c;
    }

    public int hashCode() {
        String key = getKey();
        return key != null ? key.hashCode() : Objects.hash(getName(), getUri(), Boolean.valueOf(isBot()), Boolean.valueOf(isImportant()));
    }

    public boolean isBot() {
        return this.f70140e;
    }

    public boolean isImportant() {
        return this.f70141f;
    }

    public String resolveToLegacyUri() {
        CharSequence charSequence = this.f70136a;
        String str = this.f70138c;
        if (str != null) {
            return str;
        }
        if (charSequence == null) {
            return "";
        }
        return "name:" + ((Object) charSequence);
    }

    public Person toAndroidPerson() {
        return e4.q.F(this);
    }

    public b1 toBuilder() {
        b1 b1Var = new b1();
        b1Var.f70129a = this.f70136a;
        b1Var.f70130b = this.f70137b;
        b1Var.f70131c = this.f70138c;
        b1Var.f70132d = this.f70139d;
        b1Var.f70133e = this.f70140e;
        b1Var.f70134f = this.f70141f;
        return b1Var;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f70136a);
        IconCompat iconCompat = this.f70137b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.toBundle() : null);
        bundle.putString("uri", this.f70138c);
        bundle.putString(C3191e4.h.W, this.f70139d);
        bundle.putBoolean("isBot", this.f70140e);
        bundle.putBoolean("isImportant", this.f70141f);
        return bundle;
    }

    public PersistableBundle toPersistableBundle() {
        PersistableBundle persistableBundle = new PersistableBundle();
        CharSequence charSequence = this.f70136a;
        persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
        persistableBundle.putString("uri", this.f70138c);
        persistableBundle.putString(C3191e4.h.W, this.f70139d);
        persistableBundle.putBoolean("isBot", this.f70140e);
        persistableBundle.putBoolean("isImportant", this.f70141f);
        return persistableBundle;
    }
}
