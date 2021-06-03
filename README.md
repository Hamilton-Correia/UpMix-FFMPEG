# UpMix-FFMPEG
Up Mix de áudio para 16ch.

Trata-se de um software simples desenvolvido em java com Runtime que executa um prompt de comando que faz a conversão em FFMPEG do arquivo de vídeo com áudio de entrada,
para um arquvo de saida com 16 canais de áudio, na seguinte configuração.
Projetado para arquivos MXF, mas funcioana com outros.

V - Video
A1 - L
A2 - R
A3 - L (SAP) Cópia de L
A4 - R (SAP) Cópia de R
A5 - Mute
A6 - Mute
A7 - Mute
A8 - Mute
A9 - AD L Cópia de L
A10 - AD R Cópia de R
A11 - FL - Copia de L (Filter_complex)
A12 - FR - Cópia de R (Filter_complex)
A13 - C - (Filter_complex amerge)
A14 - FLE - (Filter_complex lowpass)
A15 - BL - (Filter_complex echo L)
A16 - BR - (Filter_complex echo R)
