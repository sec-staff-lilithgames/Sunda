package q7;

import java.io.FileNotFoundException;
import java.io.IOException;
import pw.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e {
    public static final void createFile(pw.r rVar, n0 n0Var) throws IOException {
        if (rVar.exists(n0Var)) {
            return;
        }
        n.closeQuietly(rVar.sink(n0Var));
    }

    public static final void deleteContents(pw.r rVar, n0 n0Var) throws IOException {
        try {
            IOException iOException = null;
            for (n0 n0Var2 : rVar.list(n0Var)) {
                try {
                    if (rVar.metadata(n0Var2).isDirectory()) {
                        deleteContents(rVar, n0Var2);
                    }
                    rVar.delete(n0Var2);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
