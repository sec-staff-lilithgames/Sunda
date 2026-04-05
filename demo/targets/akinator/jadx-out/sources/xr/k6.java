package xr;

import io.odeeo.internal.h.vfsA.QCmNMSGd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.naming.NamingException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k6 implements b4 {

    /* renamed from: a, reason: collision with root package name */
    public static final Throwable f92732a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements a4 {

        /* renamed from: b, reason: collision with root package name */
        public static final Logger f92733b = Logger.getLogger(a.class.getName());

        /* renamed from: c, reason: collision with root package name */
        public static final Pattern f92734c = Pattern.compile("\\s+");

        /* renamed from: a, reason: collision with root package name */
        public final l6 f92735a;

        public a(l6 l6Var) {
            this.f92735a = l6Var;
        }

        @Override // xr.a4
        public List<String> resolveTxt(String str) throws NamingException {
            Level level = Level.FINER;
            Logger logger = f92733b;
            if (logger.isLoggable(level)) {
                logger.log(level, "About to query TXT records for {0}", new Object[]{str});
            }
            List<String> allRecords = ((j6) this.f92735a).getAllRecords("TXT", a.b.k("dns:///", str));
            if (logger.isLoggable(level)) {
                logger.log(level, "Found {0} TXT records", new Object[]{Integer.valueOf(allRecords.size())});
            }
            ArrayList arrayList = new ArrayList(allRecords.size());
            for (String str2 : allRecords) {
                StringBuilder sb2 = new StringBuilder(str2.length());
                int i10 = 0;
                boolean z10 = false;
                while (i10 < str2.length()) {
                    char cCharAt = str2.charAt(i10);
                    if (z10) {
                        if (cCharAt == '\"') {
                            z10 = false;
                        } else {
                            if (cCharAt == '\\') {
                                i10++;
                                cCharAt = str2.charAt(i10);
                            }
                            sb2.append(cCharAt);
                        }
                    } else if (cCharAt != ' ') {
                        if (cCharAt == '\"') {
                            z10 = true;
                        } else {
                            sb2.append(cCharAt);
                        }
                    }
                    i10++;
                }
                arrayList.add(sb2.toString());
            }
            return Collections.unmodifiableList(arrayList);
        }

        @Override // xr.a4
        public List<c4> resolveSrv(String str) throws Exception {
            String[] strArrSplit;
            Level level = Level.FINER;
            Logger logger = f92733b;
            if (logger.isLoggable(level)) {
                logger.log(level, "About to query SRV records for {0}", new Object[]{str});
            }
            List<String> allRecords = ((j6) this.f92735a).getAllRecords("SRV", a.b.k("dns:///", str));
            if (logger.isLoggable(level)) {
                logger.log(level, "Found {0} SRV records", new Object[]{Integer.valueOf(allRecords.size())});
            }
            ArrayList arrayList = new ArrayList(allRecords.size());
            Level level2 = Level.WARNING;
            RuntimeException runtimeException = null;
            for (String str2 : allRecords) {
                try {
                    strArrSplit = f92734c.split(str2, 5);
                    mh.j3.verify(strArrSplit.length == 4, "Bad SRV Record: %s", str2);
                } catch (RuntimeException e10) {
                    logger.log(level2, "Failed to construct SRV record " + str2, (Throwable) e10);
                    if (runtimeException == null) {
                        level2 = Level.FINE;
                        runtimeException = e10;
                    }
                }
                if (!strArrSplit[3].endsWith(".")) {
                    throw new RuntimeException(QCmNMSGd.VeOuXqNH + strArrSplit[3]);
                }
                arrayList.add(new c4(strArrSplit[3], Integer.parseInt(strArrSplit[2])));
            }
            if (!arrayList.isEmpty() || runtimeException == null) {
                return Collections.unmodifiableList(arrayList);
            }
            throw runtimeException;
        }
    }

    static {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            e = null;
        } catch (ClassNotFoundException e10) {
            e = e10;
        } catch (Error e11) {
            e = e11;
        } catch (RuntimeException e12) {
            e = e12;
        }
        f92732a = e;
    }

    @Override // xr.b4
    public a4 newResourceResolver() {
        if (unavailabilityCause() != null) {
            return null;
        }
        return new a(new j6());
    }

    @Override // xr.b4
    public Throwable unavailabilityCause() {
        return f92732a;
    }
}
