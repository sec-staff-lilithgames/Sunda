package xr;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j6 implements l6 {
    /* JADX INFO: Thrown type has an unknown type hierarchy: javax.naming.NamingException */
    public static void a(NamingEnumeration namingEnumeration, NamingException namingException) throws NamingException {
        try {
            namingEnumeration.close();
            throw namingException;
        } catch (NamingException unused) {
            throw namingException;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: javax.naming.NamingException */
    public static void b(DirContext dirContext, NamingException namingException) throws NamingException {
        try {
            dirContext.close();
            throw namingException;
        } catch (NamingException unused) {
            throw namingException;
        }
    }

    @Override // xr.l6
    public List<String> getAllRecords(String str, String str2) throws NamingException {
        Throwable th2 = k6.f92732a;
        if (th2 != null) {
            throw new UnsupportedOperationException("JNDI is not currently available", th2);
        }
        String[] strArr = {str};
        ArrayList arrayList = new ArrayList();
        Hashtable hashtable = new Hashtable();
        hashtable.put("com.sun.jndi.ldap.connect.timeout", "5000");
        hashtable.put("com.sun.jndi.ldap.read.timeout", "5000");
        InitialDirContext initialDirContext = new InitialDirContext(hashtable);
        try {
            NamingEnumeration all = initialDirContext.getAttributes(str2, strArr).getAll();
            while (all.hasMore()) {
                try {
                    NamingEnumeration all2 = ((Attribute) all.next()).getAll();
                    while (all2.hasMore()) {
                        try {
                            arrayList.add(String.valueOf(all2.next()));
                        } catch (NamingException e10) {
                            a(all2, e10);
                            throw null;
                        }
                    }
                    all2.close();
                } catch (NamingException e11) {
                    a(all, e11);
                    throw null;
                }
            }
            all.close();
            initialDirContext.close();
            return arrayList;
        } catch (NamingException e12) {
            b(initialDirContext, e12);
            throw null;
        }
    }
}
