/*
 * Copyright (C) 2016 astral
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ar.org.austral.java.netbeans.plugins.titlebar;

import javax.swing.JLabel;

/**
 * custom text label which display the netbeans ide or a netbeans platform based application
 * main window title.
 * 
 * @author astral
 */
public class TitleBarTitleLabel extends JLabel{

    public TitleBarTitleLabel() {
        super.setHorizontalAlignment(CENTER);
        super.setVerticalAlignment(CENTER);
    }

    @Override
    public String getText() {
        return TitleBar.getMainWindowTitle();
    }
        
}
