package pc;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import ub.p;
import ub.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class g extends f {

    /* renamed from: g, reason: collision with root package name */
    public final Class f80943g;

    /* renamed from: h, reason: collision with root package name */
    public final String f80944h;

    /* renamed from: i, reason: collision with root package name */
    public final Collection f80945i;

    /* renamed from: j, reason: collision with root package name */
    public transient String f80946j;

    public g(u uVar, String str, p pVar, Class cls, String str2, Collection collection) {
        super(uVar, str, pVar);
        this.f80943g = cls;
        this.f80944h = str2;
        this.f80945i = collection;
    }

    public Collection<Object> getKnownPropertyIds() {
        Collection collection = this.f80945i;
        if (collection == null) {
            return null;
        }
        return Collections.unmodifiableCollection(collection);
    }

    @Override // ub.x
    public String getMessageSuffix() {
        Collection collection;
        String str = this.f80946j;
        if (str != null || (collection = this.f80945i) == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(100);
        int size = collection.size();
        if (size != 1) {
            sb2.append(" (");
            sb2.append(size);
            sb2.append(" known properties: ");
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                sb2.append(AbstractJsonLexerKt.STRING);
                sb2.append(String.valueOf(it.next()));
                sb2.append(AbstractJsonLexerKt.STRING);
                if (sb2.length() > 1000) {
                    sb2.append(" [truncated]");
                    break;
                }
                if (it.hasNext()) {
                    sb2.append(", ");
                }
            }
        } else {
            sb2.append(" (one known property: \"");
            sb2.append(String.valueOf(collection.iterator().next()));
            sb2.append(AbstractJsonLexerKt.STRING);
        }
        sb2.append("])");
        String string = sb2.toString();
        this.f80946j = string;
        return string;
    }

    public String getPropertyName() {
        return this.f80944h;
    }

    public Class<?> getReferringClass() {
        return this.f80943g;
    }
}
