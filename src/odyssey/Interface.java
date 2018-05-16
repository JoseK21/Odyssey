package odyssey;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author josek
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listMusic = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        addMusic = new javax.swing.JButton();
        playerMusic = new javax.swing.JSlider();
        equalizer = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        musicPlaying = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        sortName = new javax.swing.JButton();
        sortAuthor = new javax.swing.JButton();
        sortAlbum = new javax.swing.JButton();
        sortBy = new javax.swing.JLabel();
        deleteMusic = new javax.swing.JButton();
        choiceMusic = new java.awt.Choice();
        modMetadata = new javax.swing.JButton();
        rateSong = new javax.swing.JButton();
        rate1 = new javax.swing.JRadioButton();
        rate2 = new javax.swing.JRadioButton();
        rate3 = new javax.swing.JRadioButton();
        rate4 = new javax.swing.JRadioButton();
        rate5 = new javax.swing.JRadioButton();
        recommend = new javax.swing.JButton();
        friends = new javax.swing.JLabel();
        listFriends = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        addFriend = new javax.swing.JButton();
        choiceMusicRec = new java.awt.Choice();
        search = new javax.swing.JLabel();
        music = new javax.swing.JLabel();
        choiceFriendRec = new java.awt.Choice();
        friend = new javax.swing.JLabel();
        searchS = new javax.swing.JButton();
        lab_recommend = new javax.swing.JLabel();
        lab_song = new javax.swing.JLabel();
        S_song = new javax.swing.JTextField();
        lab_artist = new javax.swing.JLabel();
        S_artist = new javax.swing.JTextField();
        lab_album = new javax.swing.JLabel();
        S_album = new javax.swing.JTextField();
        lab_letter = new javax.swing.JLabel();
        S_letter = new javax.swing.JTextField();
        lab_LyricsG = new javax.swing.JLabel();
        Guess = new javax.swing.JButton();
        Evaluate = new javax.swing.JButton();
        letter_User = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        good = new javax.swing.JRadioButton();
        medium = new javax.swing.JRadioButton();
        bad = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listMusic.setViewportView(jList1);

        addMusic.setText("Add Music");
        addMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMusicActionPerformed(evt);
            }
        });

        equalizer.setViewportView(jTextPane1);

        musicPlaying.setViewportView(jTextPane2);

        sortName.setText("Name");
        sortName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortNameActionPerformed(evt);
            }
        });

        sortAuthor.setText("Author");
        sortAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortAuthorActionPerformed(evt);
            }
        });

        sortAlbum.setText("Album");
        sortAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortAlbumActionPerformed(evt);
            }
        });

        sortBy.setText("Sort By:");

        deleteMusic.setText("Delete");
        deleteMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMusicActionPerformed(evt);
            }
        });

        modMetadata.setText("Modify metadata");
        modMetadata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modMetadataActionPerformed(evt);
            }
        });

        rateSong.setText("Rate Song");

        rate1.setText("1");
        rate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rate1ActionPerformed(evt);
            }
        });

        rate2.setText("2");
        rate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rate2ActionPerformed(evt);
            }
        });

        rate3.setText("3");
        rate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rate3ActionPerformed(evt);
            }
        });

        rate4.setText("4");
        rate4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rate4ActionPerformed(evt);
            }
        });

        rate5.setText("5");
        rate5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rate5ActionPerformed(evt);
            }
        });

        recommend.setText("Recommend");
        recommend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recommendActionPerformed(evt);
            }
        });

        friends.setText("Freinds________________________________");

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listFriends.setViewportView(jList2);

        addFriend.setText("Add Friend");
        addFriend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFriendActionPerformed(evt);
            }
        });

        search.setText("Search________________________________");

        music.setText("Music :");

        friend.setText("Freind :");

        searchS.setText("Search");
        searchS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSActionPerformed(evt);
            }
        });

        lab_recommend.setText("Recommend__________________________");

        lab_song.setText("Song :");

        lab_artist.setText("Artist :");

        lab_album.setText("Album :");

        lab_letter.setText("Letter :");

        lab_LyricsG.setText("Lyrics guessing______________________");

        Guess.setText("Guess ");

        Evaluate.setText("Evaluate ");
        Evaluate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvaluateActionPerformed(evt);
            }
        });

        letter_User.setViewportView(jTextPane4);

        good.setText("Good");
        good.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goodActionPerformed(evt);
            }
        });

        medium.setText("Medium");
        medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumActionPerformed(evt);
            }
        });

        bad.setText("Bad");
        bad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                badActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listMusic)
                    .addComponent(addMusic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(choiceMusic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(sortName)
                        .addGap(12, 12, 12)
                        .addComponent(sortAuthor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sortAlbum)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rate1)
                        .addGap(18, 18, 18)
                        .addComponent(rate2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rate5)
                        .addGap(10, 10, 10))
                    .addComponent(letter_User)
                    .addComponent(rateSong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sortBy)
                            .addComponent(lab_LyricsG)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deleteMusic)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(rate3)
                                        .addGap(26, 26, 26)
                                        .addComponent(rate4))
                                    .addComponent(modMetadata))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Guess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Evaluate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(good)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(medium)
                        .addGap(35, 35, 35)
                        .addComponent(bad)
                        .addGap(11, 11, 11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(playerMusic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(musicPlaying, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(equalizer, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addFriend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(recommend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lab_recommend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listFriends, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(music, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(choiceMusicRec, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(friend, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(choiceFriendRec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(searchS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lab_song, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lab_artist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(S_artist, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(S_song, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lab_letter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6)
                                .addComponent(S_letter, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lab_album, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(S_album, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(friends)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(equalizer, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(musicPlaying, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addMusic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortBy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sortName, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sortAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sortAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(choiceMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteMusic)
                            .addComponent(modMetadata))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rate1)
                            .addComponent(rate2)
                            .addComponent(rate3)
                            .addComponent(rate4)
                            .addComponent(rate5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rateSong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lab_LyricsG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(letter_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Guess)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(good)
                            .addComponent(medium)
                            .addComponent(bad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Evaluate))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(friends)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addFriend)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listFriends, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lab_recommend)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(music)
                            .addComponent(choiceMusicRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(friend)
                            .addComponent(choiceFriendRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recommend)
                        .addGap(18, 18, 18)
                        .addComponent(search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab_song)
                            .addComponent(S_song, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab_artist)
                            .addComponent(S_artist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab_album)
                            .addComponent(S_album, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab_letter)
                            .addComponent(S_letter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchS)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sortNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortNameActionPerformed

    private void sortAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortAuthorActionPerformed

    private void sortAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortAlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortAlbumActionPerformed

    private void addMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMusicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addMusicActionPerformed

    private void deleteMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMusicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMusicActionPerformed

    private void modMetadataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modMetadataActionPerformed
        // TODO add your handling code here:
        Metadata metadata = new Metadata();
        metadata.setVisible(true);
    }//GEN-LAST:event_modMetadataActionPerformed

    private void recommendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recommendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recommendActionPerformed

    private void addFriendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFriendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addFriendActionPerformed

    private void searchSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchSActionPerformed

    private void mediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumActionPerformed
        // TODO add your handling code here:
        bad.setSelected(false);
        good.setSelected(false);
    }//GEN-LAST:event_mediumActionPerformed

    private void badActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_badActionPerformed
        // TODO add your handling code here:
        medium.setSelected(false);
        good.setSelected(false);
    }//GEN-LAST:event_badActionPerformed

    private void rate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rate1ActionPerformed
        // TODO add your handling code here:
        rate2.setSelected(false);
        rate3.setSelected(false);
        rate4.setSelected(false);
        rate5.setSelected(false);
    }//GEN-LAST:event_rate1ActionPerformed

    private void rate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rate2ActionPerformed
        // TODO add your handling code here:
        rate1.setSelected(false);
        rate3.setSelected(false);
        rate4.setSelected(false);
        rate5.setSelected(false);
    }//GEN-LAST:event_rate2ActionPerformed

    private void rate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rate3ActionPerformed
        // TODO add your handling code here:
        rate1.setSelected(false);
        rate2.setSelected(false);
        rate4.setSelected(false);
        rate5.setSelected(false);
    }//GEN-LAST:event_rate3ActionPerformed

    private void rate4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rate4ActionPerformed
        // TODO add your handling code here:
        rate1.setSelected(false);
        rate2.setSelected(false);
        rate3.setSelected(false);
        rate5.setSelected(false);
        
    }//GEN-LAST:event_rate4ActionPerformed

    private void rate5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rate5ActionPerformed
        // TODO add your handling code here:
        rate1.setSelected(false);
        rate2.setSelected(false);
        rate3.setSelected(false);
        rate4.setSelected(false);
    }//GEN-LAST:event_rate5ActionPerformed

    private void goodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goodActionPerformed
        // TODO add your handling code here:
        medium.setSelected(false);
        bad.setSelected(false);
    }//GEN-LAST:event_goodActionPerformed

    private void EvaluateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EvaluateActionPerformed
        // TODO add your handling code here:
        if(good.isSelected()){
            
            good.setSelected(false);            
        }else if(medium.isSelected()){
            
            medium.setSelected(false);
        }else if (bad.isSelected()){
            
            bad.setSelected(false);
        }else{
            JOptionPane.showMessageDialog(this, "Please select an option to perform the rating","Evaluate",2);
        }

    }//GEN-LAST:event_EvaluateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Evaluate;
    private javax.swing.JButton Guess;
    private javax.swing.JTextField S_album;
    private javax.swing.JTextField S_artist;
    private javax.swing.JTextField S_letter;
    private javax.swing.JTextField S_song;
    private javax.swing.JButton addFriend;
    private javax.swing.JButton addMusic;
    private javax.swing.JRadioButton bad;
    private java.awt.Choice choiceFriendRec;
    private java.awt.Choice choiceMusic;
    private java.awt.Choice choiceMusicRec;
    private javax.swing.JButton deleteMusic;
    private javax.swing.JScrollPane equalizer;
    private javax.swing.JLabel friend;
    private javax.swing.JLabel friends;
    private javax.swing.JRadioButton good;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JLabel lab_LyricsG;
    private javax.swing.JLabel lab_album;
    private javax.swing.JLabel lab_artist;
    private javax.swing.JLabel lab_letter;
    private javax.swing.JLabel lab_recommend;
    private javax.swing.JLabel lab_song;
    private javax.swing.JScrollPane letter_User;
    private javax.swing.JScrollPane listFriends;
    private javax.swing.JScrollPane listMusic;
    private javax.swing.JRadioButton medium;
    private javax.swing.JButton modMetadata;
    private javax.swing.JLabel music;
    private javax.swing.JScrollPane musicPlaying;
    private javax.swing.JSlider playerMusic;
    private javax.swing.JRadioButton rate1;
    private javax.swing.JRadioButton rate2;
    private javax.swing.JRadioButton rate3;
    private javax.swing.JRadioButton rate4;
    private javax.swing.JRadioButton rate5;
    private javax.swing.JButton rateSong;
    private javax.swing.JButton recommend;
    private javax.swing.JLabel search;
    private javax.swing.JButton searchS;
    private javax.swing.JButton sortAlbum;
    private javax.swing.JButton sortAuthor;
    private javax.swing.JLabel sortBy;
    private javax.swing.JButton sortName;
    // End of variables declaration//GEN-END:variables
}