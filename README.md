# Imtehaan
This project aims to eliminate the malpractices carried out in a lab examination; for a fair lab examination to be conducted.

Malpractice is a common issue in Lab Examinations, carried out by various
means. Some of the means are mentioned below:

1. Pre-saved programs/reference codes in unknown formats (example-
.my, .dat, .an etc.) which can later be accessed and copied. These files
are not deleted before examinations as the file extensions are unknown
by the Admin.

2. Access to Browser, even when offline can be used to access/share
programs amongst students using LAN.

3. Access to programs like Gedit which allows to open files with unknown
extensions.

4. Direct access to Terminal leads to the execution of vulnerabilities using
chmod etc. once one manages to get the root key.

This project aims to eliminate the above mentioned cases.

Implementation (Abstract working explanation):
1. Disabling the Launch Bar to avoid GUI interactions.
2. Disabling certain keys like ctrl, alt, super/cmd key to avoid use of
FileManager, Terminal and other applications using keyboard shortcuts.
3. Not allowing access to any application (Browser, Gedit etc.) which allows
opening/sharing programs.
4. Not allowing direct access to Terminal.
5. Hold control even after force shutdown/reboot.
