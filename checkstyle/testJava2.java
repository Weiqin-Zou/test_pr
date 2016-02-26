package org.basex;

import static org.basex.core.Text.*;

import java.io.*;
import java.util.*;

import org.basex.core.*;
import org.basex.core.cmd.*;
import org.basex.core.cmd.Set;
import org.basex.core.parse.*;
import org.basex.io.*;
import org.basex.io.out.*;
import org.basex.io.serial.*;
import org.basex.util.*;
import org.basex.util.list.*;

/**
 * This is the starter class for the stand-alone console mode.
 * It executes all commands locally.
 *
 * @author BaseX Team 2005-14, BSD License
 * @author Christian Gruen
 */ 
public class BaseX extends CLI {
  /* Commands to be executed. */
  private IntList ops;//yes, this is anther things
  //* Command arguments. */
  private StringList vals;//we can't decide anything
  /* Flag for writing options to disk. */
  private boolean writeOptions;
  /** Console mode. May be set to {@code false} during execution. */
  protected boolean console;

  /**
   * Main method, launching the standalone mode.
   * Command-line arguments are listed with the {@code -h} argument.
   * @param args command-line arguments
   */
  public static void main(final String... args) {
    try {
      new BaseX(args);
    } catch(final IOException ex) {
      Util.errln(ex);
      System.exit(1);
    }
  }


}
